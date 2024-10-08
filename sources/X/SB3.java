package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class SB3 {
    public static final List A00 = Arrays.asList(new RDX[]{RDX.A04, RDX.A01, RDX.A03, RDX.A05, RDX.A02});

    public static QA2 A00(Context context, AutofillData autofillData, boolean z) {
        String str;
        ArrayList arrayList;
        String join;
        String str2;
        int i;
        RDX rdx;
        String A002;
        Object obj;
        int i2;
        RDX rdx2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (RDX rdx3 : RDX.values()) {
            if (rdx3.A01(autofillData) != null) {
                A1C.add(rdx3);
            }
        }
        int size = A1C.size();
        if (z) {
            int i3 = 0;
            if (size == 1) {
                A002 = ((RDX) A1C.get(0)).A00(context);
                obj = A1C.get(0);
            } else {
                Iterator it = A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    RDX rdx4 = (RDX) it.next();
                    if (A1C.contains(rdx4)) {
                        str = rdx4.A01(autofillData);
                        A1C.remove(rdx4);
                        if (rdx4 == RDX.A01) {
                            RDX rdx5 = RDX.A02;
                            if (A1C.contains(rdx5)) {
                                str = 002.A0g(str, ", ", rdx5.A01(autofillData));
                                A1C.remove(rdx5);
                            }
                        }
                    }
                }
                arrayList = AnonymousClass7TE.A1C();
                while (i3 < A1C.size()) {
                    RDX rdx6 = (RDX) A1C.get(i3);
                    RDX rdx7 = RDX.A01;
                    if (rdx6 == rdx7 && (i2 = i3 + 1) < A1C.size() && A1C.get(i2) == (rdx2 = RDX.A02)) {
                        arrayList.add(002.A0g(rdx7.A01(autofillData), ", ", rdx2.A01(autofillData)));
                        i3 = i2;
                    } else {
                        arrayList.add(rdx6.A01(autofillData));
                    }
                    i3++;
                }
                join = TextUtils.join("\n", arrayList);
                Pair create = Pair.create(str, join);
                QA2 qa2 = new QA2(context);
                qa2.setId(View.generateViewId());
                qa2.setTitle((String) create.first);
                qa2.setSubtitle((String) create.second);
                qa2.setExtraButtonText(context.getResources().getString(2131961425));
                return qa2;
            }
        } else {
            int i4 = 0;
            if (size == 1) {
                A002 = ((RDX) A1C.get(0)).A00(context);
                obj = A1C.get(0);
            } else {
                Iterator it2 = A00.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str2 = null;
                        break;
                    }
                    RDX rdx8 = (RDX) it2.next();
                    if (A1C.contains(rdx8)) {
                        str2 = rdx8.A01(autofillData);
                        A1C.remove(rdx8);
                        break;
                    }
                }
                arrayList = AnonymousClass7TE.A1C();
                while (i4 < A1C.size()) {
                    RDX rdx9 = (RDX) A1C.get(i4);
                    RDX rdx10 = RDX.A03;
                    if (rdx9 == rdx10 && (i = i4 + 1) < A1C.size() && A1C.get(i) == (rdx = RDX.A05)) {
                        arrayList.add(002.A0g(rdx10.A01(autofillData), " · ", rdx.A01(autofillData)));
                        i4 += 2;
                    } else {
                        arrayList.add(rdx9.A01(autofillData));
                        i4++;
                    }
                }
                join = TextUtils.join("\n", arrayList);
                Pair create2 = Pair.create(str, join);
                QA2 qa22 = new QA2(context);
                qa22.setId(View.generateViewId());
                qa22.setTitle((String) create2.first);
                qa22.setSubtitle((String) create2.second);
                qa22.setExtraButtonText(context.getResources().getString(2131961425));
                return qa22;
            }
        }
        join = ((RDX) obj).A01(autofillData);
        Pair create22 = Pair.create(str, join);
        QA2 qa222 = new QA2(context);
        qa222.setId(View.generateViewId());
        qa222.setTitle((String) create22.first);
        qa222.setSubtitle((String) create22.second);
        qa222.setExtraButtonText(context.getResources().getString(2131961425));
        return qa222;
    }
}
