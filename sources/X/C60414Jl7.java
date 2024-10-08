package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jl7  reason: case insensitive filesystem */
public final class C60414Jl7 extends 2Rw {
    public List A00 = 0sn.A00;
    public 0sP A01;
    public final UserSession A02;
    public final C62457Kg7 A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r0;
        0qQ.A0B(viewGroup, 0);
        UserSession userSession = this.A02;
        C62457Kg7 kg7 = this.A03;
        0eP r02 = (0eP) 00k.A0O(C60680JpR.A00, i);
        if (r02 != null && (r0 = (C249703kE) ((0sK) r02.A01).invoke(viewGroup, kg7, userSession)) != null) {
            return r0;
        }
        0kD.A07("BottomSheetListVewItemViewHolder", 002.A0O("view type not found: ", i), (Throwable) null);
        return new C61781KLu(viewGroup, userSession);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C60680JpR jpR = (C60680JpR) r3;
        0qQ.A0B(jpR, 0);
        C66472MTa mTa = (C66472MTa) 00k.A0O(this.A00, i);
        if (mTa != null) {
            jpR.A00(mTa, this.A01);
        }
    }

    public C60414Jl7(UserSession userSession, C62457Kg7 kg7) {
        this.A02 = userSession;
        this.A03 = kg7;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1778710676);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-274971299, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(-1643048839);
        Object A0O = 00k.A0O(this.A00, i);
        if (A0O != null) {
            List list = C60680JpR.A00;
            i2 = -1;
            int i4 = 0;
            if (A0O instanceof C61189Jyi) {
                Iterator it = C60680JpR.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (JTQ.A1V(C61781KLu.class, JTO.A1A(it).A00)) {
                        break;
                    }
                    i4++;
                }
            } else if (A0O instanceof C61191Jyk) {
                Iterator it2 = C60680JpR.A00.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (JTQ.A1V(C61782KLv.class, JTO.A1A(it2).A00)) {
                        break;
                    }
                    i4++;
                }
                i3 = -65980629;
            } else if (A0O instanceof C61190Jyj) {
                Iterator it3 = C60680JpR.A00.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (JTQ.A1V(C61783KLw.class, JTO.A1A(it3).A00)) {
                        break;
                    }
                    i4++;
                }
                i3 = -65980629;
            } else if (A0O instanceof C61192Jyl) {
                Iterator it4 = C60680JpR.A00.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (JTQ.A1V(C61779KLs.class, JTO.A1A(it4).A00)) {
                        break;
                    }
                    i4++;
                }
                i3 = -65980629;
            } else if (A0O instanceof C61188Jyh) {
                Iterator it5 = C60680JpR.A00.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    if (JTQ.A1V(C61780KLt.class, JTO.A1A(it5).A00)) {
                        break;
                    }
                    i4++;
                }
                i3 = -65980629;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            i2 = i4;
            i3 = -65980629;
        } else {
            i2 = -1;
            i3 = 718980677;
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
