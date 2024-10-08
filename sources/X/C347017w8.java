package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableCollection;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.enums.EnumEntries;

/* renamed from: X.7w8  reason: invalid class name and case insensitive filesystem */
public class C347017w8 extends Drawable implements C268684dp, C321026tS, Drawable.Callback, AnonymousClass5MK, AnonymousClass5ML {
    public int A00;
    public A9P A01;
    public AnonymousClass6M4 A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public C41784B0n A07;
    public final List A08;
    public final CopyOnWriteArraySet A09;
    public final Context A0A;
    public final Rect A0B;
    public final UserSession A0C;
    public final String A0D;
    public final List A0E;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.8vI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.9lv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: X.6tR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.6tR} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.9m2, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C347017w8 A00(android.content.Context r36, android.content.res.Resources.Theme r37, X.AnonymousClass9V0 r38, com.instagram.common.session.UserSession r39, X.C317876nz r40, X.C321086tY r41) {
        /*
            r1 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = r40
            java.util.List r8 = r2.A0O
            r0 = 0
        L_0x000b:
            int r4 = r8.size()
            r3 = r36
            r6 = r39
            if (r0 >= r4) goto L_0x0168
            java.lang.Object r9 = r8.get(r0)
            X.6o8 r9 = (X.C317966o8) r9
            X.6oG r5 = r2.A00()
            X.6oG r4 = X.C318046oG.GIF
            if (r5 != r4) goto L_0x00e3
            X.0qQ.A0B(r3, r1)
            r5 = 1
            X.0qQ.A0B(r6, r5)
            r5 = 2
            X.0qQ.A0B(r9, r5)
            X.6o8 r11 = r9.A0I
            float r10 = r9.A00
            float r5 = r9.A01
            float r10 = r10 * r5
            int r12 = java.lang.Math.round(r10)
            if (r11 != 0) goto L_0x00d8
            r11 = -1
        L_0x003c:
            int r10 = X.AnonymousClass8XF.A01(r3)
            int r5 = X.AnonymousClass8XF.A00(r3)
            int r10 = r10 * r5
            r5 = 0
            if (r11 <= r12) goto L_0x0050
            if (r11 > r10) goto L_0x0050
            X.6o8 r10 = r9.A0I
            if (r10 == 0) goto L_0x0050
            com.instagram.common.typedurl.ImageUrl r5 = r10.A0H
        L_0x0050:
            r16 = 0
            android.content.res.Resources r13 = r3.getResources()
            com.instagram.common.typedurl.ImageUrl r10 = r9.A0H
            X.0qQ.A07(r10)
            java.lang.String r11 = r9.A0S
            r19 = r11
            X.0qQ.A07(r19)
            int r11 = r9.A09
            java.lang.Integer r23 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = r9.A0Z
            r17 = r11
            java.lang.String r15 = r9.A0c
            r11 = 2131165223(0x7f070027, float:1.7944657E38)
            int r11 = r13.getDimensionPixelSize(r11)
            float r14 = (float) r11
            float r12 = r9.A01()
            float r11 = r9.A01
            float r9 = r9.A00
            float r11 = r11 / r9
            r9 = 2131165315(0x7f070083, float:1.7944844E38)
            int r9 = r13.getDimensionPixelSize(r9)
            X.6tX r21 = X.C321066tW.A01(r3, r12, r11, r9)
            r9 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r31 = r3.getColor(r9)
            r9 = 2131100179(0x7f060213, float:1.7812732E38)
            int r32 = r3.getColor(r9)
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            com.instagram.common.typedurl.ImageUrl r9 = X.C226972iH.A00(r10)
            java.lang.String r25 = r9.getUrl()
            X.0qQ.A07(r25)
            if (r5 == 0) goto L_0x00d5
            com.instagram.common.typedurl.ImageUrl r5 = X.C226972iH.A00(r5)
            java.lang.String r29 = r5.getUrl()
        L_0x00af:
            r34 = 1
            X.6tR r11 = new X.6tR
            r18 = r16
            r20 = r16
            r22 = r16
            r26 = r19
            r27 = r17
            r28 = r15
            r30 = r14
            r33 = r1
            r35 = r1
            r15 = r3
            r17 = r6
            r19 = r4
            r14 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x00ce:
            r7.add(r11)
            int r0 = r0 + 1
            goto L_0x000b
        L_0x00d5:
            r29 = 0
            goto L_0x00af
        L_0x00d8:
            float r10 = r11.A01
            float r5 = r11.A00
            float r10 = r10 * r5
            int r11 = java.lang.Math.round(r10)
            goto L_0x003c
        L_0x00e3:
            X.6oG r5 = r2.A00()
            X.6oG r4 = X.C318046oG.AVATAR_ANIMATED
            if (r5 != r4) goto L_0x010a
            X.0qQ.A0B(r3, r1)
            r4 = 1
            X.0qQ.A0B(r6, r4)
            r4 = 2
            X.0qQ.A0B(r9, r4)
            android.graphics.drawable.Drawable r11 = X.C320996tP.A00(r3, r6, r9, r1, r1)
            r4 = r11
            X.6tR r4 = (X.C321016tR) r4
            java.lang.String r3 = r9.A0S
            r4.A0C = r3
            java.lang.String r3 = r9.A0i
            r4.A0G = r3
            com.instagram.avatars.common.AvatarInfo r3 = r9.A0G
            r4.A09 = r3
            goto L_0x00ce
        L_0x010a:
            X.6oG r5 = r2.A00()
            X.6oG r4 = X.C318046oG.CUTOUT_VIDEO
            if (r5 != r4) goto L_0x0123
            X.8N6 r11 = new X.8N6
            r13 = r37
            r16 = r41
            r12 = r3
            r14 = r6
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r3 = r9.A0S
            r11.A0C = r3
            goto L_0x00ce
        L_0x0123:
            X.6oG r5 = r2.A00()
            X.6oG r4 = X.C318046oG.FITNESS_STICKER_CREATION
            if (r5 != r4) goto L_0x014f
            r10 = r38
            if (r38 == 0) goto L_0x014d
            long r4 = r10.A01
            java.lang.String r12 = r10.A02
            java.lang.String r10 = r9.A0U
            if (r10 == 0) goto L_0x014a
            java.lang.String r11 = r9.A0U
        L_0x0139:
            X.9V0 r10 = new X.9V0
            r10.<init>(r12, r11, r4)
        L_0x013e:
            X.9lv r11 = new X.9lv
            r12 = r3
            r13 = r10
            r14 = r6
            r15 = r2
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00ce
        L_0x014a:
            java.lang.String r11 = "UNKNOWN"
            goto L_0x0139
        L_0x014d:
            r10 = 0
            goto L_0x013e
        L_0x014f:
            java.lang.String r10 = r2.A0Z
            X.6oG r16 = r2.A00()
            com.instagram.api.schemas.RingSpecImpl r5 = r2.A00
            X.3ID r4 = r2.A06
            X.8vI r11 = new X.8vI
            r12 = r3
            r13 = r5
            r14 = r6
            r15 = r9
            r17 = r4
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00ce
        L_0x0168:
            java.lang.String r0 = r2.A0I
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r6, r0, r7)
            X.9m2 r0 = new X.9m2
            r0.<init>()
            r0.A00 = r2
            r1.A03 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347017w8.A00(android.content.Context, android.content.res.Resources$Theme, X.9V0, com.instagram.common.session.UserSession, X.6nz, X.6tY):X.7w8");
    }

    public static C347017w8 A01(Context context, UserSession userSession, C317876nz r5) {
        return A00(context, (Resources.Theme) null, (AnonymousClass9V0) null, userSession, r5, (C321086tY) null);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private void A02(Drawable drawable) {
        if (drawable instanceof C321036tT) {
            ((C321036tT) drawable).D1M(false);
        }
        Drawable A042 = A04();
        if (A042 instanceof C321036tT) {
            ((C321036tT) A042).D1M(true);
        }
        if (A042 instanceof C369768vI) {
            ((C369768vI) A042).A04();
        }
        C41784B0n b0n = this.A07;
        if (b0n != null) {
            C378669Qs r7 = (C378669Qs) b0n;
            Drawable drawable2 = r7.A0B;
            int centerX = drawable2.getBounds().centerX();
            int centerY = drawable2.getBounds().centerY();
            Rect rect = new Rect(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
            r7.Cno(true);
        }
    }

    public final Drawable A04() {
        return (Drawable) this.A08.get(this.A00);
    }

    public final Iterable A05() {
        List list = this.A08;
        list.getClass();
        if ((list instanceof C8676Qzi) || (list instanceof ImmutableCollection)) {
            return list;
        }
        return new C8676Qzi(list);
    }

    public final ArrayList A06(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A08) {
            if (cls.isInstance(next)) {
                arrayList.add(cls.cast(next));
            }
        }
        return arrayList;
    }

    public final void A07() {
        this.A01.A00 = true;
        A09();
        int i = 0;
        while (true) {
            List list = this.A08;
            if (i < list.size()) {
                Drawable drawable = (Drawable) list.get(i);
                if (drawable instanceof C321036tT) {
                    ((C321036tT) drawable).Dg0();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A08() {
        List<Drawable> list = this.A0E;
        if (list.isEmpty()) {
            C300655xZ r4 = (C300655xZ) A04();
            Drawable AKn = r4.AKn(AnonymousClass000.A00(4042));
            Drawable AKn2 = r4.AKn(AnonymousClass000.A00(4043));
            Drawable AKn3 = r4.AKn(AnonymousClass000.A00(791));
            list.add(AKn);
            list.add(AKn2);
            list.add(AKn3);
            for (Drawable callback : list) {
                callback.setCallback(this);
            }
            List list2 = this.A08;
            this.A06 = list2.size();
            list2.addAll(list);
        }
        Drawable A042 = A04();
        A03(this, this.A06);
        if (A042 != A04()) {
            A02(A042);
        }
    }

    public final void A09() {
        boolean A012 = this.A01.A01();
        AnonymousClass6M4 r2 = this.A02;
        if (A012) {
            String A002 = this.A01.A00();
            C306386Ly r0 = r2.A05;
            if (A002 == null) {
                A002 = "";
            }
            r0.A0M(A002);
            r2.invalidateSelf();
            this.A02.A01();
            A9P a9p = this.A01;
            if (a9p instanceof C387219lr) {
                ((C387219lr) a9p).A00 = true;
            } else if (a9p instanceof AnonymousClass9UZ) {
                ((AnonymousClass9UZ) a9p).A00 = true;
            }
        } else {
            r2.A00();
        }
        invalidateSelf();
    }

    public final void A0A(int i) {
        for (Drawable drawable : this.A0E) {
            C300655xZ r6 = (C300655xZ) drawable;
            String C4F = ((C300645xY) drawable).C4F();
            EnumEntries enumEntries = C21236XQh.A01;
            0qQ.A0B(C4F, 0);
            C21236XQh[] values = C21236XQh.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                C21236XQh xQh = values[i2];
                if (0qQ.A0K(xQh.A00, C4F)) {
                    r6.AGn(xQh, i);
                } else {
                    i2++;
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r3 >= r2.A08.size()) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x000b
            java.util.List r0 = r2.A08
            int r1 = r0.size()
            r0 = 1
            if (r3 < r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.17k.A0E(r0)
            int r0 = r2.A00
            if (r3 == r0) goto L_0x0023
            android.graphics.drawable.Drawable r1 = r2.A04()
            A03(r2, r3)
            android.graphics.drawable.Drawable r0 = r2.A04()
            if (r1 == r0) goto L_0x0023
            r2.A02(r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347017w8.A0B(int):void");
    }

    public final void A0C(A9P a9p) {
        int A012;
        Integer num;
        int i;
        long j;
        this.A01 = a9p;
        Context context = this.A0A;
        0qQ.A0B(context, 1);
        AnonymousClass6M3 r3 = new AnonymousClass6M3(context, this, -1);
        boolean z = a9p instanceof C387229ls;
        if (z) {
            A012 = a9p.A02.getIntrinsicWidth();
        } else {
            Context context2 = a9p.A01;
            A012 = AnonymousClass8XF.A01(context2) - (context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) * 2);
        }
        r3.A00 = A012;
        if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        0qQ.A0B(num, 0);
        r3.A06 = num;
        r3.A07 = a9p.A00();
        if (z) {
            i = R.dimen.action_bar_item_spacing_right;
        } else {
            i = R.dimen.achievements_only_you_bottom_margin;
        }
        r3.A02(i);
        if (z) {
            j = 4000;
        } else {
            j = 2000;
        }
        r3.A03 = j;
        this.A02 = r3.A00();
        A09();
    }

    public final boolean A0E(Class cls) {
        for (Object isInstance : this.A08) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    public final void A9D(C41815B1v b1v) {
        this.A09.add(b1v);
        Drawable A042 = A04();
        if (A042 instanceof C268684dp) {
            C268684dp r1 = (C268684dp) A042;
            if (r1.isLoading()) {
                r1.A9D(b1v);
                return;
            }
        }
        b1v.DOX();
    }

    public final void AHg() {
        this.A09.clear();
        Drawable A042 = A04();
        if (A042 instanceof C268684dp) {
            ((C268684dp) A042).AHg();
        }
    }

    public final AnonymousClass6M4 C49() {
        return C321156tf.A00(this.A0A, this);
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void EE1(C41815B1v b1v) {
        this.A09.remove(b1v);
        Drawable A042 = A04();
        if (A042 instanceof C268684dp) {
            ((C268684dp) A042).EE1(b1v);
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.A04) {
            this.A02.draw(canvas);
            A04().draw(canvas);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.A02 || this.A08.indexOf(drawable) == this.A00) {
            invalidateSelf();
        }
    }

    public C347017w8(Context context, UserSession userSession, String str, List list) {
        this.A09 = new CopyOnWriteArraySet();
        this.A0B = new Rect();
        this.A00 = 0;
        this.A05 = false;
        this.A06 = -1;
        this.A04 = false;
        this.A0C = userSession;
        this.A0A = context;
        this.A0D = str;
        this.A0E = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        arrayList.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            ((Drawable) list.get(i)).setCallback(this);
        }
        A0C(new AnonymousClass9UZ(context, userSession, this, this.A0D));
        A02((Drawable) null);
    }

    public static void A03(C347017w8 r8, int i) {
        Drawable A042 = r8.A04();
        if (A042 instanceof C268684dp) {
            ((C268684dp) A042).AHg();
        }
        int intrinsicWidth = r8.A04().getIntrinsicWidth();
        int intrinsicHeight = r8.A04().getIntrinsicHeight();
        Rect rect = r8.A0B;
        r8.copyBounds(rect);
        r8.A00 = i;
        r8.A00 = i % r8.A08.size();
        int intrinsicWidth2 = r8.A04().getIntrinsicWidth();
        int intrinsicHeight2 = r8.A04().getIntrinsicHeight();
        int round = rect.left + Math.round(((float) (intrinsicWidth - intrinsicWidth2)) / 2.0f);
        int round2 = rect.top + Math.round(((float) (intrinsicHeight - intrinsicHeight2)) / 2.0f);
        r8.setBounds(round, round2, intrinsicWidth2 + round, intrinsicHeight2 + round2);
        if (rect.equals(r8.getBounds())) {
            r8.onBoundsChange(r8.getBounds());
        }
        Drawable A043 = r8.A04();
        if (A043 instanceof C268684dp) {
            C268684dp r2 = (C268684dp) A043;
            Iterator it = r8.A09.iterator();
            while (it.hasNext()) {
                r2.A9D((C41815B1v) it.next());
            }
        }
        r8.A09();
        r8.invalidateSelf();
    }

    public final boolean A0D() {
        Drawable A042 = A04();
        A03(this, this.A00 + 1);
        if (A042 == A04()) {
            return false;
        }
        A02(A042);
        return true;
    }

    public final void AQX(Canvas canvas) {
        A04().draw(canvas);
    }

    public final void CLr() {
        if (A04() instanceof C321026tS) {
            ((C321026tS) A04()).CLr();
        }
    }

    public final boolean CZ7(UserSession userSession) {
        if (!(A04() instanceof C321026tS) || !((C321026tS) A04()).CZ7(userSession)) {
            return false;
        }
        return true;
    }

    public final void FL9(boolean z, boolean z2) {
        if (A04() instanceof C321026tS) {
            ((C321026tS) A04()).FL9(z, z2);
        }
    }

    public final int getIntrinsicHeight() {
        return A04().getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return A04().getIntrinsicWidth();
    }

    public final int getOpacity() {
        return A04().getOpacity();
    }

    public final boolean isLoading() {
        Drawable A042 = A04();
        if (A042 instanceof C268684dp) {
            return ((C268684dp) A042).isLoading();
        }
        return false;
    }

    public final void onBoundsChange(Rect rect) {
        A04().setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setAlpha(int i) {
        A04().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        A04().setColorFilter(colorFilter);
    }

    public final void EcL(C41784B0n b0n) {
        this.A07 = b0n;
    }

    public C347017w8(Context context, UserSession userSession, List list) {
        this(context, userSession, (String) null, list);
    }
}
