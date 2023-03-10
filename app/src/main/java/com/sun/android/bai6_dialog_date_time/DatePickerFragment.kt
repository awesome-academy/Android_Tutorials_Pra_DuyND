package com.sun.android.bai6_dialog_date_time

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.util.*


class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener{


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current date as the default date in the picker.
        val calendar = Calendar.getInstance()
        val year: Int = calendar.get(Calendar.YEAR)
        val month: Int = calendar.get(Calendar.MONTH)
        val day: Int = calendar.get(Calendar.DAY_OF_MONTH)
        val dialogDate = DatePickerDialog(requireActivity(),this, year,month,day)
        // Create a new instance of DatePickerDialog and return it.
        return dialogDate
    }

    override fun onDateSet(datePicker: DatePicker, year: Int, month: Int, day: Int) {
        (activity as? MainActivity)?.processDatePickerResult(year, month, day)
    }
}

