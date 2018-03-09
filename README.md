#Android RecyclerView Example 

MainActivity generates an ArrayList of 1000 My Little Pony names

activity_main.xml layout contains a RecyclerView

list_item.xml contains TextView for a single item to be used by the RecyclerView

PonyAdaptor extends RecyclerView.Adaptor and inflates the list_item

Two views that both extend RecyclerView.ViewHolder are implemented in PonyViewHolderDark and PonyViewHolderLight

The PonyAdaptor then applies the light view to list items with an even number position in the list and the dark view to the list items with an odd number position in the list
