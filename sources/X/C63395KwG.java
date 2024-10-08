package X;

import android.content.Context;
import android.media.MediaScannerConnection;
import java.util.LinkedList;

/* renamed from: X.KwG  reason: case insensitive filesystem */
public abstract class C63395KwG {
    public static final void A00(Context context, String str, String str2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        ((MediaScannerConnection) new LVM(context, str2, linkedList).A00.getValue()).connect();
    }
}
