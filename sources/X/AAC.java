package X;

import android.app.RemoteInput;

public abstract class AAC {
    public static int A00(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static void A01(RemoteInput.Builder builder, int i) {
        builder.setEditChoicesBeforeSending(i);
    }
}
