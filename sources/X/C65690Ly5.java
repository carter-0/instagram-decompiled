package X;

import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ly5  reason: case insensitive filesystem */
public final class C65690Ly5 implements C3493580b {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass8W6 A02;
    public final AnonymousClass80W A03;
    public final AnonymousClass0eM A04;

    public C65690Ly5(AnonymousClass4DH r9, UserSession userSession, AnonymousClass8W6 r11, AnonymousClass80W r12) {
        int A022 = DbW.A02(1, r9, userSession);
        int A08 = C51970G9q.A08(3, r12, r11);
        this.A00 = r9;
        this.A01 = userSession;
        this.A03 = r12;
        this.A02 = r11;
        MMU mmu = new MMU(this, 5);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMU(new MMU(r9, A022), 3));
        this.A04 = DbS.A0I(new MMU(A002, A08), mmu, new MJ9(29, (Object) null, A002), DbS.A0z(C60268JiP.class));
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r9.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r2, this, (AnonymousClass4D7) null, A022), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        C60268JiP jiP;
        ImageUrl imageUrl;
        Object mMs;
        if (obj == AnonymousClass80V.MUSIC_FIRST_TRACK_SELECTION && (obj3 instanceof AnonymousClass8UN)) {
            jiP = (C60268JiP) this.A04.getValue();
            C66569MWx mWx = ((AnonymousClass8UN) obj3).A00;
            jiP.A00 = mWx.As5();
            imageUrl = mWx.As5();
            mMs = new C66312MMv(32, mWx, jiP);
        } else if (obj == AnonymousClass80V.MUSIC_OVERLAY_STICKER_COMPOSE && (obj3 instanceof C356708Ux)) {
            jiP = (C60268JiP) this.A04.getValue();
            imageUrl = ((C356708Ux) obj3).A00.BUu().A04;
            0qQ.A0B(imageUrl, 0);
            if (0qQ.A0K(jiP.A00, imageUrl)) {
                C60268JiP.A00(KL9.A00, jiP);
                return;
            } else {
                jiP.A00 = imageUrl;
                mMs = new C66309MMs(jiP, 29);
            }
        } else {
            return;
        }
        DisplayMetrics displayMetrics = jiP.A02;
        String A012 = 2RR.A01();
        int i = jiP.A01;
        FZB fzb = new FZB(mMs, 0);
        0qQ.A0B(imageUrl, 1);
        0nY.A00().ATE(new KJF(displayMetrics, imageUrl, fzb, A012, 15, -16777216, i));
    }
}
