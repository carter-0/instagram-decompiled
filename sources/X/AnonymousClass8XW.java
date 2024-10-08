package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8XW  reason: invalid class name */
public final class AnonymousClass8XW {
    public int A00 = -1;
    public AnonymousClass8XX A01;
    public Folder A02;
    public Runnable A03;
    public Map A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass8XZ A08;
    public final UserSession A09;
    public final AnonymousClass8XU A0A;
    public final Map A0B;
    public final 05G A0C;
    public final boolean A0D;
    public final 2Cn A0E;

    public final void A0B(Medium medium) {
        0qQ.A0B(medium, 0);
        AnonymousClass8XX r2 = this.A01;
        if (r2 != null) {
            r2.Ejh(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)), true, false);
        }
    }

    public AnonymousClass8XW(Context context, 2Cn r31, AnonymousClass8XX r32, AnonymousClass8XU r33) {
        AnonymousClass8XU r7 = r33;
        this.A0A = r7;
        this.A01 = r32;
        Context context2 = context;
        this.A07 = context2;
        2Cn r1 = r31;
        this.A0E = r1;
        UserSession userSession = r7.A0A;
        this.A09 = userSession;
        AnonymousClass07i r27 = r7.A05;
        AnonymousClass8XO r15 = r7.A08;
        int i = r7.A01;
        int i2 = r7.A02;
        boolean z = r7.A0G;
        boolean z2 = r7.A0F;
        2Cn r9 = new AnonymousClass8XY(r1, this);
        long j = r7.A04;
        long j2 = r7.A03;
        long j3 = j2;
        long j4 = j;
        int i3 = i;
        int i4 = i2;
        UserSession userSession2 = userSession;
        2Cn r17 = r9;
        C348927zH r14 = r7.A07;
        Context context3 = context2;
        AnonymousClass07i r13 = r27;
        AnonymousClass8XZ r11 = new AnonymousClass8XZ(context3, r13, r14, r15, userSession2, r17, i3, i4, j4, j3, z, z2, r7.A0K);
        this.A08 = r11;
        this.A0D = r7.A0E;
        AnonymousClass8XR r0 = r7.A0B;
        if (r0 != null) {
            r11.A03 = r0;
        }
        LinkedHashMap A002 = A00(this);
        this.A0B = A002;
        0qQ.A0B(A002, 0);
        this.A04 = A002;
        A03(this);
        Folder folder = (Folder) this.A04.get(Integer.valueOf(r7.A00));
        if (folder == null) {
            Object obj = A002.get(-1);
            if (obj != null) {
                folder = (Folder) obj;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A02 = folder;
        this.A00 = folder.A02;
        this.A0C = new 02z(folder);
    }

    public static final LinkedHashMap A00(AnonymousClass8XW r6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = r6.A07;
        String string = context.getString(2131962528);
        0qQ.A07(string);
        linkedHashMap.put(-1, new Folder(string, (String) null, -1, false));
        String string2 = context.getString(2131962527);
        0qQ.A07(string2);
        linkedHashMap.put(-2, new Folder(string2, (String) null, -2, false));
        String string3 = context.getString(2131962529);
        0qQ.A07(string3);
        linkedHashMap.put(-3, new Folder(string3, (String) null, -3, false));
        String string4 = context.getString(2131962526);
        0qQ.A07(string4);
        linkedHashMap.put(-5, new Folder(string4, (String) null, -5, false));
        String string5 = context.getString(2131962523);
        0qQ.A07(string5);
        linkedHashMap.put(-9, new Folder(string5, (String) null, -9, false));
        String string6 = context.getString(2131962525);
        0qQ.A07(string6);
        linkedHashMap.put(-10, new Folder(string6, (String) null, -10, false));
        linkedHashMap.put(-6, new Folder("Instagram", (String) null, -6, false));
        linkedHashMap.put(-7, new Folder("Boomerang", (String) null, -7, false));
        linkedHashMap.put(-8, new Folder("Layout", (String) null, -8, false));
        return linkedHashMap;
    }

    public static final void A01(Medium medium, Folder folder) {
        folder.A00++;
        0qQ.A0B(medium, 0);
        folder.A05.add(medium);
        folder.A06.add(Integer.valueOf(medium.A05));
        folder.A01 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.gallery.Medium r9, X.AnonymousClass8XW r10, java.util.Map r11) {
        /*
            int r0 = r9.A08
            java.lang.String r2 = "Required value was null."
            r3 = 1
            if (r0 != r3) goto L_0x0018
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0018:
            X.8XU r0 = r10.A0A
            X.8XO r1 = r0.A08
            X.8XO r0 = X.AnonymousClass8XO.PHOTO_ONLY
            if (r1 == r0) goto L_0x019f
            r0 = -3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 == 0) goto L_0x0199
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            A01(r9, r0)
            int r1 = r9.A03
            r0 = 60000(0xea60, float:8.4078E-41)
            if (r1 < r0) goto L_0x004e
            r0 = -10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0049:
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            A01(r9, r0)
        L_0x004e:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 == 0) goto L_0x0193
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            A01(r9, r0)
            java.lang.String r5 = r9.A0O
            if (r5 == 0) goto L_0x019f
            int r0 = r5.length()
            if (r0 <= r3) goto L_0x019f
            boolean r0 = r9.A0f
            if (r0 == 0) goto L_0x007d
            r0 = -9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 == 0) goto L_0x018d
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            A01(r9, r0)
        L_0x007d:
            int r7 = r5.length()
            int r7 = r7 - r3
            r8 = r7
            r4 = 0
            r3 = 0
        L_0x0085:
            r6 = 32
            if (r4 > r7) goto L_0x00a7
            r0 = r7
            if (r3 != 0) goto L_0x008d
            r0 = r4
        L_0x008d:
            char r0 = r5.charAt(r0)
            int r1 = X.0qQ.A00(r0, r6)
            r0 = 0
            if (r1 > 0) goto L_0x0099
            r0 = 1
        L_0x0099:
            if (r3 != 0) goto L_0x00a2
            if (r0 != 0) goto L_0x009f
            r3 = 1
            goto L_0x0085
        L_0x009f:
            int r4 = r4 + 1
            goto L_0x0085
        L_0x00a2:
            if (r0 == 0) goto L_0x00a7
            int r7 = r7 + -1
            goto L_0x0085
        L_0x00a7:
            int r0 = r7 + 1
            java.lang.CharSequence r0 = r5.subSequence(r4, r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "Instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ca
            r0 = -6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0187
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00ca:
            r7 = r8
            r4 = 0
            r3 = 0
        L_0x00cd:
            if (r4 > r7) goto L_0x00ed
            r0 = r7
            if (r3 != 0) goto L_0x00d3
            r0 = r4
        L_0x00d3:
            char r0 = r5.charAt(r0)
            int r1 = X.0qQ.A00(r0, r6)
            r0 = 0
            if (r1 > 0) goto L_0x00df
            r0 = 1
        L_0x00df:
            if (r3 != 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00e5
            r3 = 1
            goto L_0x00cd
        L_0x00e5:
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            int r7 = r7 + -1
            goto L_0x00cd
        L_0x00ed:
            int r0 = r7 + 1
            java.lang.CharSequence r0 = r5.subSequence(r4, r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "Boomerang"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0110
            r0 = -7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0187
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0110:
            r4 = 0
            r3 = 0
        L_0x0112:
            if (r4 > r8) goto L_0x0132
            r0 = r8
            if (r3 != 0) goto L_0x0118
            r0 = r4
        L_0x0118:
            char r0 = r5.charAt(r0)
            int r1 = X.0qQ.A00(r0, r6)
            r0 = 0
            if (r1 > 0) goto L_0x0124
            r0 = 1
        L_0x0124:
            if (r3 != 0) goto L_0x012d
            if (r0 != 0) goto L_0x012a
            r3 = 1
            goto L_0x0112
        L_0x012a:
            int r4 = r4 + 1
            goto L_0x0112
        L_0x012d:
            if (r0 == 0) goto L_0x0132
            int r8 = r8 + -1
            goto L_0x0112
        L_0x0132:
            int r0 = r8 + 1
            java.lang.CharSequence r0 = r5.subSequence(r4, r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "Layout"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0155
            r0 = -8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0187
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0155:
            int r0 = r9.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0175
            int r5 = r9.A02
            java.lang.String r4 = r9.A0O
            r3 = 0
            r0 = 0
            com.instagram.ui.widget.mediapicker.Folder r1 = new com.instagram.ui.widget.mediapicker.Folder
            r1.<init>(r4, r3, r5, r0)
            int r0 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.put(r0, r1)
        L_0x0175:
            int r0 = r9.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.get(r0)
            if (r0 != 0) goto L_0x0187
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0187:
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            A01(r9, r0)
            return
        L_0x018d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0193:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0199:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8XW.A02(com.instagram.common.gallery.Medium, X.8XW, java.util.Map):void");
    }

    public static final void A03(AnonymousClass8XW r2) {
        for (Folder folder : r2.A0B.values()) {
            folder.A05.clear();
            folder.A06.clear();
            folder.A01 = null;
            folder.A00 = 0;
        }
    }

    public final ArrayList A04() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A04.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            switch (intValue) {
                case -10:
                case -9:
                case -8:
                case -7:
                case -6:
                case -5:
                case -3:
                case -2:
                case -1:
                    arrayList.add(value);
                    break;
            }
        }
        return arrayList;
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A04.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Folder folder = (Folder) entry.getValue();
            if (!(folder.A05.isEmpty() || intValue == -1 || intValue == -2 || intValue == -3 || intValue == -5 || intValue == -9 || intValue == -6 || intValue == -7 || intValue == -8 || intValue == -10)) {
                arrayList.add(folder);
            }
        }
        return arrayList;
    }

    public final List A06() {
        Object obj = this.A0B.get(-1);
        if (obj != null) {
            return ((Folder) obj).A01();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07() {
        A0A(this.A0A.A01);
    }

    public final void A08() {
        ((AnonymousClass0vF) AnonymousClass8XZ.A0K.getValue()).ATE(new C357678Ze(this.A08));
        this.A0A.A09.AHU();
    }

    public final void A09() {
        AnonymousClass8XZ r2 = this.A08;
        if (r2.A0A) {
            ((AnonymousClass0vF) AnonymousClass8XZ.A0K.getValue()).ATE(new C357298Xi(r2));
        }
    }

    public final void A0A(int i) {
        if (this.A0A.A0H) {
            this.A05 = false;
        }
        AnonymousClass8XZ r2 = this.A08;
        r2.A01 = i;
        r2.A01(new AnonymousClass8XY(this.A0E, this));
    }

    public final void A0C(AnonymousClass8XX r4) {
        this.A01 = r4;
        List A012 = this.A02.A01();
        String str = this.A02.A03;
        if (str == null) {
            str = "";
        }
        r4.Ecr(Integer.valueOf(this.A00), str, A012);
    }

    public final boolean A0D(int i) {
        Map map = this.A04;
        Integer valueOf = Integer.valueOf(i);
        Folder folder = (Folder) map.get(valueOf);
        if (folder == null && ((folder = (Folder) this.A0B.get(valueOf)) == null || !folder.A07)) {
            folder = (Folder) this.A04.get(Integer.valueOf(this.A0A.A00));
        }
        if (folder == null || (0qQ.A0K(this.A02, folder) && !this.A06)) {
            return false;
        }
        this.A06 = false;
        this.A02 = folder;
        this.A00 = i;
        this.A0C.Epw(folder);
        AnonymousClass8XX r3 = this.A01;
        if (r3 == null) {
            return true;
        }
        List A012 = this.A02.A01();
        String str = this.A02.A03;
        if (str == null) {
            str = "";
        }
        r3.Ecr(Integer.valueOf(this.A00), str, A012);
        return true;
    }
}
