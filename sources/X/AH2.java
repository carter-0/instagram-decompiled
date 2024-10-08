package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class AH2 {
    public int A00;
    public ArrayList A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final PendingIntent A05;
    public final Bundle A06;
    public final IconCompat A07;
    public final CharSequence A08;

    public final ADG A01() {
        A7Y[] a7yArr;
        CharSequence[] charSequenceArr;
        if (!this.A04 || this.A05 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList arrayList = this.A01;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A7Y a7y = (A7Y) it.next();
                    if (a7y.A05 || (!((charSequenceArr = a7y.A06) == null || charSequenceArr.length == 0) || a7y.A04.isEmpty())) {
                        A1C2.add(a7y);
                    } else {
                        A1C.add(a7y);
                    }
                }
            }
            A7Y[] a7yArr2 = null;
            if (A1C.isEmpty()) {
                a7yArr = null;
            } else {
                a7yArr = (A7Y[]) A1C.toArray(new A7Y[A1C.size()]);
            }
            if (!A1C2.isEmpty()) {
                a7yArr2 = (A7Y[]) A1C2.toArray(new A7Y[A1C2.size()]);
            }
            return new ADG(this.A05, this.A06, this.A07, this.A08, a7yArr2, a7yArr, this.A00, this.A02, true, this.A04, this.A03);
        }
        throw AnonymousClass7TE.A11("Contextual Actions must contain a valid PendingIntent");
    }

    public AH2(PendingIntent pendingIntent, IconCompat iconCompat, CharSequence charSequence) {
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A02 = true;
        this.A07 = iconCompat;
        this.A08 = AnonymousClass9T8.A00(charSequence);
        this.A05 = pendingIntent;
        this.A06 = A0a;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A04 = false;
        this.A03 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AH2 A00(android.app.Notification.Action r6) {
        /*
            android.graphics.drawable.Icon r0 = r6.getIcon()
            if (r0 == 0) goto L_0x0048
            android.graphics.drawable.Icon r2 = r6.getIcon()
            int r1 = r2.getType()
            r0 = 2
            if (r1 != r0) goto L_0x0043
            int r0 = r2.getResId()
            if (r0 != 0) goto L_0x0043
            r2 = 0
        L_0x0018:
            java.lang.CharSequence r1 = r6.title
            android.app.PendingIntent r0 = r6.actionIntent
            X.AH2 r3 = new X.AH2
            r3.<init>((android.app.PendingIntent) r0, (androidx.core.graphics.drawable.IconCompat) r2, (java.lang.CharSequence) r1)
        L_0x0021:
            android.app.RemoteInput[] r5 = r6.getRemoteInputs()
            if (r5 == 0) goto L_0x0054
            int r4 = r5.length
            if (r4 == 0) goto L_0x0054
            r2 = 0
        L_0x002b:
            r0 = r5[r2]
            X.A7Y r1 = X.AAB.A01(r0)
            java.util.ArrayList r0 = r3.A01
            if (r0 != 0) goto L_0x003b
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r3.A01 = r0
        L_0x003b:
            r0.add(r1)
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x0054
            goto L_0x002b
        L_0x0043:
            androidx.core.graphics.drawable.IconCompat r2 = X.C66773McJ.A01(r2)
            goto L_0x0018
        L_0x0048:
            int r2 = r6.icon
            java.lang.CharSequence r1 = r6.title
            android.app.PendingIntent r0 = r6.actionIntent
            X.AH2 r3 = new X.AH2
            r3.<init>((android.app.PendingIntent) r0, (java.lang.CharSequence) r1, (int) r2)
            goto L_0x0021
        L_0x0054:
            boolean r0 = r6.getAllowGeneratedReplies()
            r3.A02 = r0
            int r0 = r6.getSemanticAction()
            r3.A00 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0076
            boolean r0 = X.C392319uc.A00(r6)
            r3.A04 = r0
            r0 = 31
            if (r1 < r0) goto L_0x0076
            boolean r0 = X.C392329ud.A00(r6)
            r3.A03 = r0
        L_0x0076:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L_0x0081
            android.os.Bundle r0 = r3.A06
            r0.putAll(r1)
        L_0x0081:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AH2.A00(android.app.Notification$Action):X.AH2");
    }

    public AH2(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        IconCompat A012 = i != 0 ? IconCompat.A01((Resources) null, "", i) : null;
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A02 = true;
        this.A07 = A012;
        this.A08 = AnonymousClass9T8.A00(charSequence);
        this.A05 = pendingIntent;
        this.A06 = A0a;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A04 = false;
        this.A03 = false;
    }
}
