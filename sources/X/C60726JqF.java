package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JqF  reason: case insensitive filesystem */
public final class C60726JqF extends C14191TrW {
    public final UserSession A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60726JqF(Fragment fragment, UserSession userSession, List list) {
        super(fragment);
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = list;
    }

    public final Fragment A03(int i) {
        C62474KgP kgP;
        C322576w3.A00().A00.getValue();
        int ordinal = C62474KgP.values()[i].ordinal();
        if (ordinal == 0) {
            kgP = C62474KgP.POST;
        } else if (ordinal == 1) {
            kgP = C62474KgP.STORY;
        } else if (ordinal == 2) {
            kgP = C62474KgP.REEL;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        UserSession userSession = this.A00;
        Bundle A0B = DbV.A0B(userSession, 1);
        A0B.putSerializable("PromoteMediaPickerContentFragment.ARGUMENT_MEDIA_CONTENT_TYPE", kgP);
        DbU.A1D(A0B, userSession);
        C61410K6h k6h = new C61410K6h();
        k6h.setArguments(A0B);
        return k6h;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1061353728);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(15666111, A03);
        return size;
    }
}
