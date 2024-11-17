package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<InterfaceType extends ListDiffInterface> extends DiffUtil.ItemCallback<InterfaceType> {

    @Override
    public boolean areItemsTheSame(@NonNull InterfaceType oldItem, @NonNull InterfaceType newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull InterfaceType oldItem, @NonNull InterfaceType newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull InterfaceType oldItem, @NonNull InterfaceType newItem) {
        return newItem;
    }
}
