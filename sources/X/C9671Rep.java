package X;

import android.content.Context;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Rep  reason: case insensitive filesystem */
public abstract class C9671Rep {
    public static QmZ A00(Context context, ImmutableList immutableList, String str, boolean z) {
        int i;
        int i2;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            if (((LinkParams) immutableList.get(i3)).A01 != 0) {
                str = str.replace(((LinkParams) immutableList.get(i3)).A03, context.getString(((LinkParams) immutableList.get(i3)).A01));
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (int i4 = 0; i4 < immutableList.size(); i4++) {
            int i5 = ((LinkParams) immutableList.get(i4)).A01;
            LinkParams linkParams = (LinkParams) immutableList.get(i4);
            if (i5 != 0) {
                String string = context.getString(linkParams.A01);
                i = str.indexOf(string);
                i2 = DbX.A05(string);
            } else {
                i = linkParams.A02;
                i2 = ((LinkParams) immutableList.get(i4)).A00;
            }
            if (z) {
                A1C2.add(new C10587Ruh(Integer.valueOf(AnonymousClass2E0.A0A().A03(context, 17)), i2, i));
            } else {
                A1C.add(new SF9(i2, i, ((LinkParams) immutableList.get(i4)).A04, ((LinkParams) immutableList.get(i4)).A05));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(A1C);
        List unmodifiableList2 = Collections.unmodifiableList(A1C2);
        AnonymousClass7TG.A1T(str, unmodifiableList, unmodifiableList2);
        return new QmZ(str, unmodifiableList, unmodifiableList2);
    }
}
