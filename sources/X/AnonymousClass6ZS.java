package X;

import androidx.fragment.app.Fragment;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6ZS  reason: invalid class name */
public final class AnonymousClass6ZS implements 27S {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public AnonymousClass6ZS(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        Fragment fragment = (Fragment) this.A00.A08.get();
        if (fragment == null || !fragment.isResumed()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        1Xj r0;
        String A2n;
        String str;
        int A03 = AnonymousClass0fD.A03(-1396265971);
        C312476eU r11 = (C312476eU) obj;
        int A032 = AnonymousClass0fD.A03(1706511516);
        0qQ.A0B(r11, 0);
        C317116mk r5 = this.A00.A07;
        AnonymousClass1Xp r9 = r11.A00;
        AnonymousClass6Z5 r52 = (AnonymousClass6Z5) r5;
        0qQ.A0B(r9, 0);
        C273384mU r1 = r52.A17;
        C255773uh Au5 = r1.Au5();
        if (!(Au5 == null || (r0 = Au5.A0b) == null || (A2n = r0.A2n()) == null || !A2n.equals(r9.Bi4()) || r52.A0e == null || r52.A0g == null || r52.A0f == null)) {
            ((C310566bG) ((ReelViewerFragment) r1).A1E).A0B.Bz3(Au5).A0x = true;
            C313216g4 r02 = r52.A0e;
            if (r02 == null) {
                str = "reelPhotoTimerController";
            } else {
                r02.A02();
                C313246g8 r03 = r52.A0g;
                if (r03 == null) {
                    str = "showreelNativeTimerController";
                } else {
                    r03.A01();
                    C313266gA r04 = r52.A0f;
                    if (r04 == null) {
                        str = "showreelCompositionTimerController";
                    } else {
                        r04.A01();
                        r1.ADX(false);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(-1404400227, A032);
        AnonymousClass0fD.A0A(-394487180, A03);
    }
}
