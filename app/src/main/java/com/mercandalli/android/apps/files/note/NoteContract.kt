package com.mercandalli.android.apps.files.note

interface NoteContract {

    interface UserAction {

        fun onAttached()

        fun onDetached()

        fun onTextChanged(text: String)

        fun onShareClicked()

        fun onDeleteClicked()

        fun onDeleteConfirmedClicked()
    }

    interface Screen {

        fun setNote(note: String)

        fun showDeleteConfirmation()

        fun setTextColorRes(textColorRes: Int)

        fun setTextHintColorRes(textColorRes: Int)

        fun setCardBackgroundColorRes(colorRes: Int)
    }
}