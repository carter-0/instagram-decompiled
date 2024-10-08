package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class MCV implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public MCV(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj4;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r9) {
        if (this.A00 != 0) {
            C62718KlI klI = (C62718KlI) obj;
            if (!(klI instanceof C61331K2s)) {
                if (klI instanceof C61330K2r) {
                    FragmentActivity A0E = DbZ.A0E(this.A02);
                    if (A0E != null) {
                        Object obj2 = this.A03;
                        C49739F4e.A00(A0E, ((C61330K2r) klI).A00, (UserSession) this.A04, new FmG(obj2, 1), "ig_comments");
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            ((C314326i1) this.A01).A01();
        } else {
            C66393MPz mPz = (C66393MPz) obj;
            if (mPz instanceof C64538Ldf) {
                JTO.A1a(this.A01, 0);
            } else if (mPz instanceof C64537Lde) {
                JTO.A1a(this.A01, 8);
                C59689JTv.A04(DbT.A07(this.A04));
            } else if (mPz instanceof C61148Jxy) {
                List list = ((C61148Jxy) mPz).A00;
                boolean isEmpty = list.isEmpty();
                Object obj3 = this.A01;
                if (isEmpty) {
                    JTO.A1a(obj3, 8);
                    View view = (View) this.A03;
                    DbT.A1F(view, R.id.scheduled_content_empty_state_container, 0);
                    LY1.A00(AnonymousClass7TF.A0G(view, R.id.schedule_content_empty_schedule_post_button), 34, this.A04);
                } else {
                    JTO.A1a(obj3, 8);
                    JTO.A1a(this.A02, 0);
                    C61381K4z k4z = (C61381K4z) this.A04;
                    C60435JlT jlT = k4z.A00;
                    if (jlT != null) {
                        ArrayList A1D = AnonymousClass7TE.A1D(list);
                        jlT.A00 = A1D;
                        int size = A1D.size();
                        ArrayList A0v = DbS.A0v(size);
                        for (int i = 0; i < size; i++) {
                            A0v.add((Object) null);
                        }
                        jlT.A01 = A0v;
                        jlT.notifyDataSetChanged();
                        C60435JlT jlT2 = k4z.A00;
                        if (jlT2 != null) {
                            jlT2.A01();
                        }
                    }
                    0qQ.A0F("adapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return C60340gF.A00;
    }
}
