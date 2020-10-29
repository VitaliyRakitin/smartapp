function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note
    }, context);
}