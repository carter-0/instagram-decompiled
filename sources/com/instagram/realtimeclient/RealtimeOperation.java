package com.instagram.realtimeclient;

public final class RealtimeOperation {
    public Type op;
    public String path;
    public String timestamp;
    public String value;

    public enum Type {
        add,
        remove,
        replace,
        notify
    }
}
