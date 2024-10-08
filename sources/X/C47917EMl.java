package X;

import android.widget.ListView;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.Set;

/* renamed from: X.EMl  reason: case insensitive filesystem */
public final class C47917EMl extends C249383je implements G6S {
    public final ListView A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C46446Df8 A03;
    public final C49420EvM A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public C47917EMl(ListView listView, AnonymousClass0iw r3, UserSession userSession, C49420EvM evM) {
        0qQ.A0B(evM, 3);
        this.A02 = userSession;
        this.A01 = r3;
        this.A04 = evM;
        this.A00 = listView;
        this.A03 = new C46446Df8(userSession, this);
    }

    public final void EG6(UserSession userSession, int i) {
        Hashtag hashtag;
        String id;
        if (this.A04.A00.mUserVisibleHint) {
            Object itemAtPosition = this.A00.getItemAtPosition(i);
            if ((itemAtPosition instanceof Hashtag) && (hashtag = (Hashtag) itemAtPosition) != null) {
                Set set = this.A05;
                if (!00k.A0u(set, hashtag.getId()) && (id = hashtag.getId()) != null) {
                    set.add(id);
                }
            }
        }
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int A0D = AnonymousClass7TG.A0D(r10, 1243050441);
        this.A03.onScroll(r10, i, i2, i3, i4, i5);
        AnonymousClass0fD.A0A(-2029326405, A0D);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A0D = AnonymousClass7TG.A0D(r3, 1814557651);
        this.A03.onScrollStateChanged(r3, i);
        AnonymousClass0fD.A0A(1921945171, A0D);
    }
}
