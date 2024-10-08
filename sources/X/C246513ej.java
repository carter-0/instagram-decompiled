package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.3ej  reason: invalid class name and case insensitive filesystem */
public final class C246513ej extends 0Yg implements 0sJ {
    public static final C246513ej A00 = new C246513ej();

    public C246513ej() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C246893fP r4 = (C246893fP) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        Context context = (Context) obj4;
        0qQ.A0B(r4, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(context, 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        AnonymousClass7AV.A05(spannableStringBuilder, new C54486HFs(r4, context.getColor(2Yu.A0E(context))), str);
        return spannableStringBuilder;
    }
}
