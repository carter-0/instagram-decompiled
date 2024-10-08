package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class UAJ extends 2Rw {
    public static final int A05 = Calendar.getInstance().getActualMaximum(7);
    public final DateFormat A00 = new SimpleDateFormat(AnonymousClass000.A00(2361));
    public final Calendar A01 = Calendar.getInstance();
    public final List A02 = new ArrayList();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public static String A00(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":");
        if (i3 == -1) {
            sb.append(i2);
        } else {
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
        }
        return sb.toString();
    }

    public final String A01(Date date) {
        Calendar calendar = this.A01;
        calendar.setTime(date);
        return A00(calendar.get(1), DbZ.A06(calendar), DbU.A03(calendar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        if (X.2PP.A00(r5.A00, r2.getId()) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r25, int r26) {
        /*
            r24 = this;
            r3 = r24
            r2 = r26
            r6 = r25
            int r1 = r3.getItemViewType(r2)
            java.util.List r0 = r3.A02
            java.lang.Object r11 = r0.get(r2)
            if (r1 == 0) goto L_0x0043
            r0 = 1
            if (r1 == r0) goto L_0x0023
            r0 = 2
            if (r1 == r0) goto L_0x0024
            X.VMm r11 = (X.C17208VMm) r11
            X.UBp r6 = (X.C14836UBp) r6
            android.widget.TextView r1 = r6.A00
            java.lang.String r0 = r11.A00
            r1.setText(r0)
        L_0x0023:
            return
        L_0x0024:
            X.VrW r11 = (X.C18427VrW) r11
            X.UjZ r3 = (X.C15849UjZ) r3
            X.UBp r6 = (X.C14836UBp) r6
            android.widget.TextView r2 = r6.A00
            java.lang.String[] r1 = X.C18427VrW.A01
            int r0 = r11.A00
            r0 = r1[r0]
            r2.setText(r0)
            r1 = 8
            android.content.Context r0 = r3.A06
            float r0 = X.0nA.A04(r0, r1)
            int r1 = (int) r0
            r0 = 0
            r2.setPadding(r0, r0, r0, r1)
            return
        L_0x0043:
            X.VRo r11 = (X.C17335VRo) r11
            java.util.Map r1 = r3.A04
            java.util.Date r10 = r11.A01
            java.lang.String r0 = r3.A01(r10)
            java.util.List r1 = X.C66580MXl.A13(r0, r1)
            r5 = r3
            X.UjZ r5 = (X.C15849UjZ) r5
            X.UEp r6 = (X.C14910UEp) r6
            r15 = 0
            r9 = 4
            android.widget.TextView r4 = r6.A02
            r4.setVisibility(r15)
            android.widget.ImageView r0 = r6.A01
            r0.setVisibility(r9)
            X.7i4 r0 = r6.A06
            r0.stop()
            android.widget.ImageView r3 = r6.A00
            r8 = 0
            if (r1 == 0) goto L_0x0113
            java.lang.Object r7 = r1.get(r15)
            X.VVC r7 = (X.VVC) r7
            if (r7 == 0) goto L_0x0114
            com.instagram.model.reels.Reel r2 = r7.A01
            java.lang.String r1 = r5.A00
            java.lang.String r0 = r2.getId()
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 != 0) goto L_0x0093
        L_0x0082:
            android.view.View r0 = r6.itemView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.view.View r0 = r6.itemView
            r0.setScaleX(r1)
            android.view.View r0 = r6.itemView
            r0.setScaleY(r1)
        L_0x0093:
            java.lang.String r0 = r11.A00
            r4.setText(r0)
            X.3NM r1 = r6.A07
            r1.A02()
            if (r7 == 0) goto L_0x00f5
            com.instagram.common.typedurl.ImageUrl r0 = r7.A00
            if (r0 == 0) goto L_0x00ab
            com.instagram.common.typedurl.ImageUrl r7 = r6.A03
            boolean r7 = X.2PP.A00(r7, r0)
            if (r7 != 0) goto L_0x00e0
        L_0x00ab:
            android.content.Context r9 = X.DbS.A07(r6)
            int r7 = r5.A05
            r10 = 0
            r14 = 1058642330(0x3f19999a, float:0.6)
            r21 = 1
            r18 = 200(0xc8, double:9.9E-322)
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r8 = new X.JdE
            r11 = r10
            r12 = r10
            r16 = r15
            r17 = r7
            r20 = r15
            r22 = r21
            r23 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x00dd
            X.0iw r7 = r5.A0A
            java.lang.String r7 = r7.getModuleName()
            r8.A02(r0, r7)
            android.graphics.ColorFilter r7 = r5.A07
            r8.setColorFilter(r7)
        L_0x00dd:
            r3.setImageDrawable(r8)
        L_0x00e0:
            r6.A03 = r0
            r0 = -1
            r4.setTextColor(r0)
            r6.A05 = r2
            X.UjW r0 = new X.UjW
            r0.<init>(r15, r5, r6, r2)
            r6.A04 = r0
            r3.setVisibility(r15)
        L_0x00f2:
            r1.A01 = r15
            return
        L_0x00f5:
            r6.A03 = r8
            r3.setImageDrawable(r8)
            r3.setVisibility(r9)
            long r6 = r10.getTime()
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            int r0 = r5.A03
        L_0x010b:
            r4.setTextColor(r0)
            r15 = 1
            goto L_0x00f2
        L_0x0110:
            int r0 = r5.A02
            goto L_0x010b
        L_0x0113:
            r7 = r8
        L_0x0114:
            r2 = r8
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAJ.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        if (i != 0) {
            if (i == 1) {
                textView = new TextView(viewGroup.getContext());
                textView.setBackgroundColor(Color.argb(0, 0, 0, 0));
            } else if (i == 2) {
                Context context = viewGroup.getContext();
                textView = new TextView(context);
                0oh.A07(textView.getContext(), (Typeface) null, textView, AnonymousClass05K.A00);
                DbY.A12(textView, context);
                textView.setGravity(17);
                textView.setTextSize(1, 12.0f);
                JTQ.A0w(textView, ((C15849UjZ) this).A01, -2);
            } else if (i == 3) {
                Context context2 = viewGroup.getContext();
                textView = new TextView(context2);
                0oh.A07(context2, C15849UjZ.A0D, textView, AnonymousClass05K.A01);
                DbY.A12(textView, context2);
                textView.setTextSize(1, 16.0f);
                Context context3 = ((C15849UjZ) this).A06;
                textView.setPadding(0, (int) 0nA.A04(context3, 40), 0, (int) 0nA.A04(context3, 12));
                textView.setGravity(17);
            } else {
                throw new IllegalStateException(AnonymousClass000.A00(4152));
            }
            return new C14836UBp(textView);
        }
        C15849UjZ ujZ = (C15849UjZ) this;
        return new C14910UEp(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.calendar_day_view), ujZ.A01, ujZ.A04);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-376809072);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(590514223, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(-1344896365);
        Object obj = this.A02.get(i);
        if (obj instanceof C17335VRo) {
            i2 = 0;
            i3 = -1129235607;
        } else if (obj instanceof VB3) {
            i2 = 1;
            i3 = -1622569561;
        } else if (obj instanceof C18427VrW) {
            i2 = 2;
            i3 = -519923697;
        } else if (obj instanceof C17208VMm) {
            i2 = 3;
            i3 = 1117374065;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("unexpected item type");
            AnonymousClass0fD.A0A(1582319975, A032);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
