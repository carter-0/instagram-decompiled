package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

public final class UFU extends C14191TrW {
    public final XIGIGBoostCallToAction A00;
    public final XIGIGBoostDestination A01;
    public final UserSession A02;
    public final AudioOverlayTrack A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UFU(Fragment fragment, XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, AudioOverlayTrack audioOverlayTrack, String str, String str2, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(fragment);
        0qQ.A0B(userSession, 2);
        this.A02 = userSession;
        this.A01 = xIGIGBoostDestination;
        this.A06 = list;
        this.A04 = str;
        this.A00 = xIGIGBoostCallToAction;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A05 = str2;
        this.A0B = z6;
        this.A07 = list2;
        this.A03 = audioOverlayTrack;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1838224194);
        int length = AnonymousClass05K.A00(2).length;
        AnonymousClass0fD.A0A(-948594974, A032);
        return length;
    }
}
