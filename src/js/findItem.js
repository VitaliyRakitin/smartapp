function findItemIdBySelectedItem(request) {
    var items = getItems(request);
    var selected_item = getSelectedItem(request);
    if (selected_item && items && items.length > selected_item.index) {
        return items[selected_item.index].id;
    }
    return null;
}

function findItemIdByNumber(number, request) {
    var items = getItems(request);
    if (items && items.length) {
        for (var ind = 0; ind < items.length; ind++) {
            if (items[ind].number == number) {
                return items[ind].id;
            }
        }
    }
    return null;
}
