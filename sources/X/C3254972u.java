package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import kotlin.Deprecated;

/* renamed from: X.72u  reason: invalid class name and case insensitive filesystem */
public abstract class C3254972u {
    @Deprecated(message = "")
    public static final View A00(Context context, ViewGroup viewGroup) {
        0qQ.A0B(context, 0);
        0qQ.A0B(viewGroup, 1);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A01 = A01(from, viewGroup);
        A01.setTag(new AnonymousClass730(A01));
        return A01;
    }

    public static final View A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        0qQ.A0B(viewGroup, 1);
        if (Systrace.A0E(1)) {
            0fS.A01("EmptyStateBinder.newView", 1353522714);
        }
        try {
            View inflate = layoutInflater.inflate(R.layout.layout_listview_empty_state, viewGroup, false);
            0qQ.A07(inflate);
            return inflate;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-563381524);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C3253572b r6, X.AnonymousClass730 r7, X.C320156rr r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r5 = 1
            X.0qQ.A0B(r6, r5)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x001c
            r1 = 1955577591(0x748fbef7, float:9.110982E31)
            java.lang.String r0 = "EmptyStateBinder.bindView"
            X.0fS.A01(r0, r1)
        L_0x001c:
            android.view.View r2 = r7.itemView     // Catch:{ all -> 0x0070 }
            X.0qQ.A06(r2)     // Catch:{ all -> 0x0070 }
            boolean r0 = r6.A0L     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x003f
            X.0nA.A0W(r2, r5)     // Catch:{ all -> 0x0070 }
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()     // Catch:{ all -> 0x0070 }
            X.6pT r0 = new X.6pT     // Catch:{ all -> 0x0070 }
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0070 }
        L_0x0031:
            r1.addOnPreDrawListener(r0)     // Catch:{ all -> 0x0070 }
        L_0x0034:
            A03(r6, r7, r8)     // Catch:{ all -> 0x0070 }
            X.6wO r0 = r6.A06     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0063
            r0.DBx()     // Catch:{ all -> 0x0070 }
            goto L_0x0063
        L_0x003f:
            boolean r0 = r6.A0M     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x004d
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()     // Catch:{ all -> 0x0070 }
            X.Trh r0 = new X.Trh     // Catch:{ all -> 0x0070 }
            r0.<init>(r2)     // Catch:{ all -> 0x0070 }
            goto L_0x0031
        L_0x004d:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ all -> 0x0070 }
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r1 = r1.getDimensionPixelOffset(r0)     // Catch:{ all -> 0x0070 }
            r0 = -2
            X.0nA.A0V(r2, r0)     // Catch:{ all -> 0x0070 }
            X.0nA.A0c(r2, r1)     // Catch:{ all -> 0x0070 }
            X.0nA.A0X(r2, r1)     // Catch:{ all -> 0x0070 }
            goto L_0x0034
        L_0x0063:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x006f
            r0 = 56621515(0x35ff9cb, float:6.582056E-37)
            X.0fS.A00(r0)
        L_0x006f:
            return
        L_0x0070:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x007d
            r0 = 1418325492(0x5489edf4, float:4.7392217E12)
            X.0fS.A00(r0)
        L_0x007d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3254972u.A02(X.72b, X.730, X.6rr):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r5.A0N == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C3253572b r16, X.AnonymousClass730 r17, X.C320156rr r18) {
        /*
            r11 = 0
            r4 = r17
            X.0qQ.A0B(r4, r11)
            r3 = 1
            r13 = 2
            r5 = r16
            X.0qQ.A0B(r5, r3)
            r12 = 4
            r14 = r18
            X.0qQ.A0B(r14, r13)
            r17 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x0023
            r1 = -335910434(0xffffffffebfa69de, float:-6.054628E26)
            java.lang.String r0 = "EmptyStateBinder.bindViewWithoutHeightAdjustment"
            X.0fS.A01(r0, r1)
        L_0x0023:
            android.view.View r2 = r4.itemView     // Catch:{ all -> 0x015f }
            X.0qQ.A06(r2)     // Catch:{ all -> 0x015f }
            android.view.View$OnClickListener r0 = r5.A05     // Catch:{ all -> 0x015f }
            X.AnonymousClass0fU.A00(r0, r2)     // Catch:{ all -> 0x015f }
            com.instagram.igds.components.emptystate.IgdsEmptyState r6 = r4.A02     // Catch:{ all -> 0x015f }
            boolean r1 = r5.A0H     // Catch:{ all -> 0x015f }
            r8 = 8
            r10 = 0
            r0 = 0
            if (r1 == 0) goto L_0x0039
            r0 = 8
        L_0x0039:
            r6.setVisibility(r0)     // Catch:{ all -> 0x015f }
            int r7 = r5.A02     // Catch:{ all -> 0x015f }
            int r1 = r5.A01     // Catch:{ all -> 0x015f }
            r9 = -1
            r0 = 0
            if (r1 != r9) goto L_0x0045
            r0 = 1
        L_0x0045:
            r6.EZe(r7, r0)     // Catch:{ all -> 0x015f }
            X.6rr r0 = X.C320156rr.EMPTY     // Catch:{ all -> 0x015f }
            if (r14 == r0) goto L_0x0050
            X.6rr r0 = X.C320156rr.EMPTY_PRO     // Catch:{ all -> 0x015f }
            if (r14 != r0) goto L_0x0055
        L_0x0050:
            boolean r0 = r5.A0N     // Catch:{ all -> 0x015f }
            r7 = 1
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            android.content.res.Resources r0 = r2.getResources()     // Catch:{ all -> 0x015f }
            r1 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r15 = r0.getDimensionPixelSize(r1)     // Catch:{ all -> 0x015f }
            if (r7 == 0) goto L_0x0066
            r1 = 2131165259(0x7f07004b, float:1.794473E38)
        L_0x0066:
            int r7 = r0.getDimensionPixelSize(r1)     // Catch:{ all -> 0x015f }
            android.view.View r1 = r4.itemView     // Catch:{ all -> 0x015f }
            r1.setPadding(r15, r7, r15, r7)     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r5.A0D     // Catch:{ all -> 0x015f }
            if (r7 == 0) goto L_0x0079
            int r1 = r7.length()     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x0085
        L_0x0079:
            java.lang.Integer r1 = r5.A0B     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00dd
            int r1 = r1.intValue()     // Catch:{ all -> 0x015f }
            java.lang.String r7 = r0.getString(r1)     // Catch:{ all -> 0x015f }
        L_0x0085:
            r6.setHeadline((java.lang.CharSequence) r7)     // Catch:{ all -> 0x015f }
            boolean r1 = r5.A0K     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0098
            r6.setIsEmphasized(r3)     // Catch:{ all -> 0x015f }
            boolean r1 = r5.A0J     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00d9
            r1 = 32
            r2.setPadding(r11, r1, r11, r11)     // Catch:{ all -> 0x015f }
        L_0x0098:
            java.lang.CharSequence r1 = r5.A07     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00ca
            int r1 = r1.length()     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00ca
            java.lang.CharSequence r3 = r5.A07     // Catch:{ all -> 0x015f }
        L_0x00a4:
            r6.setBody((java.lang.CharSequence) r3)     // Catch:{ all -> 0x015f }
            java.lang.CharSequence r2 = r5.A08     // Catch:{ all -> 0x015f }
            r6.setDetailText(r2)     // Catch:{ all -> 0x015f }
            android.widget.TextView r1 = r4.A00     // Catch:{ all -> 0x015f }
            r1.setVisibility(r8)     // Catch:{ all -> 0x015f }
            X.6wO r15 = r5.A06     // Catch:{ all -> 0x015f }
            java.lang.String r1 = r5.A0C     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00bd
            int r16 = r1.length()     // Catch:{ all -> 0x015f }
            if (r16 != 0) goto L_0x00e0
        L_0x00bd:
            java.lang.Integer r1 = r5.A09     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00df
            int r1 = r1.intValue()     // Catch:{ all -> 0x015f }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x015f }
            goto L_0x00e0
        L_0x00ca:
            java.lang.Integer r1 = r5.A0A     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x00d7
            int r1 = r1.intValue()     // Catch:{ all -> 0x015f }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ all -> 0x015f }
            goto L_0x00a4
        L_0x00d7:
            r3 = 0
            goto L_0x00a4
        L_0x00d9:
            r2.setPadding(r11, r11, r11, r11)     // Catch:{ all -> 0x015f }
            goto L_0x0098
        L_0x00dd:
            r7 = 0
            goto L_0x0085
        L_0x00df:
            r1 = 0
        L_0x00e0:
            if (r15 != 0) goto L_0x00e4
            r0 = 0
            goto L_0x00e9
        L_0x00e4:
            X.Mfd r0 = new X.Mfd     // Catch:{ all -> 0x015f }
            r0.<init>(r15)     // Catch:{ all -> 0x015f }
        L_0x00e9:
            r6.setAction(r1, r0)     // Catch:{ all -> 0x015f }
            android.widget.TextView r0 = r4.A01     // Catch:{ all -> 0x015f }
            r0.setVisibility(r8)     // Catch:{ all -> 0x015f }
            int r0 = r14.ordinal()     // Catch:{ all -> 0x015f }
            if (r0 == r13) goto L_0x0109
            if (r0 == r12) goto L_0x0121
            int r1 = r5.A02     // Catch:{ all -> 0x015f }
            int r0 = r5.A01     // Catch:{ all -> 0x015f }
            if (r0 != r9) goto L_0x0100
            r10 = 1
        L_0x0100:
            r6.EZe(r1, r10)     // Catch:{ all -> 0x015f }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A03     // Catch:{ all -> 0x015f }
            r0.setVisibility(r8)     // Catch:{ all -> 0x015f }
            goto L_0x0129
        L_0x0109:
            r6.setImageResource(r11)     // Catch:{ all -> 0x015f }
            boolean r0 = r5.A0F     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x011b
            if (r7 != 0) goto L_0x011b
            if (r3 != 0) goto L_0x011b
            if (r2 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
            r6.setVisibility(r8)     // Catch:{ all -> 0x015f }
        L_0x011b:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A03     // Catch:{ all -> 0x015f }
            r0.setVisibility(r11)     // Catch:{ all -> 0x015f }
            goto L_0x0129
        L_0x0121:
            r6.setImageResource(r11)     // Catch:{ all -> 0x015f }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A03     // Catch:{ all -> 0x015f }
            r0.setVisibility(r8)     // Catch:{ all -> 0x015f }
        L_0x0129:
            boolean r0 = r5.A0I     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x0130
            r6.CLQ()     // Catch:{ all -> 0x015f }
        L_0x0130:
            int r1 = r5.A00     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x014d
            boolean r0 = r5.A0E     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x014d
            android.view.View r2 = r4.itemView     // Catch:{ all -> 0x015f }
            android.content.Context r1 = r2.getContext()     // Catch:{ all -> 0x015f }
            r0 = 2130970127(0x7f04060f, float:1.7548955E38)
            int r0 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x015f }
            int r0 = r1.getColor(r0)     // Catch:{ all -> 0x015f }
            r2.setBackgroundColor(r0)     // Catch:{ all -> 0x015f }
            goto L_0x0152
        L_0x014d:
            android.view.View r0 = r4.itemView     // Catch:{ all -> 0x015f }
            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x015f }
        L_0x0152:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x015e
            r0 = -1656810212(0xffffffff9d3f151c, float:-2.5289553E-21)
            X.0fS.A00(r0)
        L_0x015e:
            return
        L_0x015f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r17)
            if (r0 == 0) goto L_0x016c
            r0 = 986958843(0x3ad3cbfb, float:0.0016158813)
            X.0fS.A00(r0)
        L_0x016c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3254972u.A03(X.72b, X.730, X.6rr):void");
    }
}
