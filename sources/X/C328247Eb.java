package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Eb  reason: invalid class name and case insensitive filesystem */
public final class C328247Eb implements AnonymousClass7PM {
    public final C328007Db A00;
    public final View A01;
    public final View A02;
    public final C328067Dh A03;
    public final C328257Ec A04;
    public final C328087Dj A05;
    public final C328007Db A06;
    public final C328007Db A07;
    public final C328007Db A08;
    public final C328007Db A09;
    public final C328007Db A0A;
    public final C328007Db A0B;
    public final C328007Db A0C;
    public final C328007Db A0D;
    public final C328007Db A0E;
    public final C328007Db A0F;
    public final C328007Db A0G;
    public final C328007Db A0H;
    public final C328007Db A0I;
    public final C328007Db A0J;
    public final C328007Db A0K;

    public final void DAn(Canvas canvas, Integer num, float f) {
        int i;
        View BJd;
        Integer num2 = num;
        0qQ.A0B(num, 2);
        if (this.A03 != null) {
            View view = this.A02;
            int height = view.getHeight();
            C328007Db r0 = this.A00;
            if (r0 == null || (BJd = r0.BJd()) == null) {
                i = 0;
            } else {
                i = BJd.getHeight();
            }
            int i2 = height - i;
            int i3 = new int[]{0, i2}[0];
            if (i2 > i3) {
                i3 = i2;
            }
            Canvas canvas2 = canvas;
            this.A04.A01(canvas2, C3V(), num2, f, (float) (view.getTop() + (i3 / 2)), (float) view.getLeft(), (float) view.getRight());
        }
    }

    public final void Dq2(Integer num) {
        AnonymousClass7DX r1;
        Object obj;
        0qQ.A0B(num, 0);
        C328067Dh r0 = this.A03;
        if (r0 != null && (r1 = r0.A01) != null && (obj = r0.A00) != null) {
            AnonymousClass7FU r4 = (AnonymousClass7FU) obj;
            if (num == AnonymousClass05K.A00 && r4.BOV().A0X) {
                r1.A00.Eur(r4, C69347Njm.SWIPE, new MessageIdentifier(r4.BSG().A01, r4.BSG().A00()));
            } else if (num == AnonymousClass05K.A01) {
                ((AnonymousClass7XS) r1.A00).EuG(r4.BSG(), (C273414mX) null, r4.BOV().A04, (String) null, (String) null, (String) null, "swipe");
            }
        }
    }

    public final boolean AFz() {
        AnonymousClass7FU r3;
        C333107Xr r0;
        C328067Dh r02 = this.A03;
        if (!(r02 == null || (r3 = (AnonymousClass7FU) r02.A00) == null || ((r0 = (C333107Xr) r02.A02) != null && r0.CPk()))) {
            AnonymousClass7FR BOV = r3.BOV();
            if (BOV.A0X || BOV.A0E) {
                return true;
            }
        }
        return false;
    }

    public final Integer C3V() {
        Object obj;
        Integer num;
        C328067Dh r1 = this.A03;
        if (r1 == null || r1.A01 == null || (obj = r1.A00) == null) {
            return AnonymousClass05K.A00;
        }
        boolean A022 = 0mk.A02(r1.A00);
        boolean CU2 = ((AnonymousClass7FU) obj).CU2();
        if (!A022 ? !CU2 : CU2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        0qQ.A07(num);
        return num;
    }

    public final float C3X() {
        if (this.A03 == null) {
            return Float.MAX_VALUE;
        }
        C328257Ec r0 = this.A04;
        return r0.A02 + r0.A03;
    }

    public final List CFS() {
        ArrayList arrayList = new ArrayList();
        C328007Db r0 = this.A0E;
        if (r0 != null) {
            View BJd = r0.BJd();
            0qQ.A07(BJd);
            arrayList.add(BJd);
        }
        C328007Db r02 = this.A06;
        if (r02 != null) {
            View BJd2 = r02.BJd();
            0qQ.A07(BJd2);
            arrayList.add(BJd2);
        }
        C328007Db r03 = this.A0K;
        if (r03 != null) {
            View BJd3 = r03.BJd();
            0qQ.A07(BJd3);
            arrayList.add(BJd3);
        }
        C328007Db r04 = this.A0J;
        if (r04 != null) {
            View BJd4 = r04.BJd();
            0qQ.A07(BJd4);
            arrayList.add(BJd4);
        }
        C328007Db r05 = this.A0F;
        if (r05 != null) {
            View BJd5 = r05.BJd();
            0qQ.A07(BJd5);
            arrayList.add(BJd5);
        }
        C328007Db r06 = this.A0C;
        if (r06 != null) {
            View BJd6 = r06.BJd();
            0qQ.A07(BJd6);
            arrayList.add(BJd6);
        }
        C328007Db r07 = this.A0B;
        if (r07 != null) {
            View BJd7 = r07.BJd();
            0qQ.A07(BJd7);
            arrayList.add(BJd7);
        }
        return arrayList;
    }

    public final List CFT() {
        ArrayList arrayList = new ArrayList();
        if (this.A03 != null) {
            View BJd = this.A0I.BJd();
            0qQ.A07(BJd);
            arrayList.add(BJd);
            C328007Db r0 = this.A08;
            if (r0 != null) {
                View BJd2 = r0.BJd();
                0qQ.A07(BJd2);
                arrayList.add(BJd2);
            }
            C328007Db r02 = this.A09;
            if (r02 != null) {
                View BJd3 = r02.BJd();
                0qQ.A07(BJd3);
                arrayList.add(BJd3);
            }
            View view = this.A01;
            if (view != null) {
                arrayList.add(view);
            }
            C328007Db r03 = this.A0H;
            if (r03 != null) {
                View BJd4 = r03.BJd();
                0qQ.A07(BJd4);
                arrayList.add(BJd4);
            }
            C328007Db r04 = this.A07;
            if (r04 != null) {
                View BJd5 = r04.BJd();
                0qQ.A07(BJd5);
                arrayList.add(BJd5);
            }
            C328007Db r05 = this.A0D;
            if (r05 != null) {
                View BJd6 = r05.BJd();
                0qQ.A07(BJd6);
                arrayList.add(BJd6);
            }
            C328007Db r06 = this.A0A;
            if (r06 != null) {
                View BJd7 = r06.BJd();
                0qQ.A07(BJd7);
                arrayList.add(BJd7);
            }
            C328007Db r07 = this.A0G;
            if (r07 != null) {
                View BJd8 = r07.BJd();
                0qQ.A07(BJd8);
                arrayList.add(BJd8);
            }
        }
        return arrayList;
    }

    public C328247Eb(Context context, View view, View view2, C328007Db r7, C328007Db r8, C328007Db r9, C328007Db r10, C328007Db r11, C328007Db r12, C328007Db r13, C328007Db r14, C328007Db r15, C328007Db r16, C328007Db r17, C328007Db r18, C328007Db r19, C328007Db r20, C328007Db r21, C328007Db r22) {
        C328087Dj r1;
        C328017Dc r72;
        this.A02 = view;
        this.A0I = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A01 = view2;
        this.A0H = r10;
        this.A00 = r11;
        this.A07 = r12;
        this.A0D = r13;
        this.A0E = r14;
        this.A06 = r15;
        this.A0K = r16;
        this.A0J = r17;
        this.A0A = r18;
        this.A0F = r19;
        this.A0C = r20;
        this.A0G = r21;
        this.A0B = r22;
        this.A04 = new C328257Ec(context);
        C328067Dh r2 = null;
        if (!(r7 instanceof C328017Dc) || (r72 = (C328017Dc) r7) == null) {
            r1 = null;
        } else {
            r1 = r72.BY0();
        }
        this.A05 = r1;
        this.A03 = r1 instanceof C328067Dh ? (C328067Dh) r1 : r2;
    }

    public final boolean AG0(MotionEvent motionEvent) {
        return AFz();
    }
}
