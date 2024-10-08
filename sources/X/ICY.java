package X;

import android.view.View;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class ICY implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public ICY(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A06 = obj5;
        this.A05 = obj;
        this.A04 = obj3;
        this.A01 = i;
        this.A03 = obj2;
        this.A02 = obj4;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(1979291300);
                ((AnonymousClass2pM) this.A06).A02.A01 = null;
                ((C227802jw) this.A04).A0L((1Xj) this.A02, (C55512Hiu) this.A03, this.A01);
                i = -1959276877;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(-951178429);
                CreatorViewerBottomCTA creatorViewerBottomCTA = (CreatorViewerBottomCTA) this.A05;
                CreatorViewerBottomCTAType AhL = creatorViewerBottomCTA.AhL();
                1Xj r5 = (1Xj) this.A04;
                int i2 = this.A01;
                H0K.A01(AhL, (C46307DUk) this.A03, r5, (IgdsBottomButtonLayout) this.A02, (H0K) this.A06, i2, AnonymousClass7TF.A1W(creatorViewerBottomCTA.AhL(), CreatorViewerBottomCTAType.SAVE_CLIP));
                i = -1603545136;
                break;
            default:
                A052 = AnonymousClass0fD.A05(1343472500);
                CreatorViewerBottomCTAType AhL2 = ((CreatorViewerBottomCTA) this.A05).AhL();
                1Xj r3 = (1Xj) this.A04;
                int i3 = this.A01;
                H0K.A01(AhL2, (C46307DUk) this.A03, r3, (IgdsBottomButtonLayout) this.A02, (H0K) this.A06, i3, false);
                i = -588851066;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
