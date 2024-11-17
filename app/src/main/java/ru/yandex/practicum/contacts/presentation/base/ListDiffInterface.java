package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<InterfaceType> {
    public boolean theSameAs(InterfaceType interfaceType);
    public boolean equals(Object object);
}
