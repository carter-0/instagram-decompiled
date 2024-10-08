package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.JqJ  reason: case insensitive filesystem */
public final class C60730JqJ extends C14191TrW {
    public ArrayList A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60730JqJ(Fragment fragment, UserSession userSession) {
        super(fragment);
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
    }

    public final Fragment A03(int i) {
        Bundle A09;
        Fragment k6m;
        C322576w3.A00().A02();
        BoostMediaPickerTabType boostMediaPickerTabType = (BoostMediaPickerTabType) DbZ.A0g(this.A00, i);
        int ordinal = boostMediaPickerTabType.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            A09 = DbY.A09(userSession);
            A09.putString(AnonymousClass000.A00(701), boostMediaPickerTabType.toString());
            k6m = new C61415K6m();
        } else if (ordinal == 3) {
            UserSession userSession2 = this.A01;
            0qQ.A0B(userSession2, 0);
            A09 = DbY.A09(userSession2);
            A09.putString(AnonymousClass000.A00(701), boostMediaPickerTabType.toString());
            k6m = new C61414K6l();
        } else {
            throw AnonymousClass7TE.A0w("The tab type in tab list must be FEED(IG feed) or STORY(IG story) or CLIPS(IG reel)");
        }
        k6m.setArguments(A09);
        return k6m;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(763089522);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1655710175, A03);
        return size;
    }

    public final long getItemId(int i) {
        int A03 = AnonymousClass0fD.A03(-1094292415);
        long hashCode = (long) this.A00.get(i).hashCode();
        AnonymousClass0fD.A0A(637321070, A03);
        return hashCode;
    }
}
