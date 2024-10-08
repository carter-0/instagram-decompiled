package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.TLu  reason: case insensitive filesystem */
public final /* synthetic */ class C13111TLu implements Comparator {
    public static final /* synthetic */ C13111TLu A00 = new Object();

    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
