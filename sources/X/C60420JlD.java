package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.JlD  reason: case insensitive filesystem */
public final class C60420JlD extends 2Rw {
    public final Activity A00;
    public final UserSession A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final 0sP A03;
    public final 0sP A04;

    public C60420JlD(Activity activity, UserSession userSession, 0sP r4, 0sP r5) {
        0qQ.A0B(userSession, 4);
        this.A00 = activity;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        if (i == 0) {
            0qQ.A0A(A0F);
            Activity activity = this.A00;
            0sP r7 = this.A03;
            0sP r8 = this.A04;
            UserSession userSession = this.A01;
            AnonymousClass7TG.A0w(0, A0F, r7, r8);
            return new C61818KNh(activity, DbU.A09(A0F, viewGroup, R.layout.layout_share_content_funding_item, false), userSession, r7, r8);
        } else if (i == 1) {
            0qQ.A0A(A0F);
            0sP r1 = this.A03;
            AnonymousClass7TF.A1B(A0F, 0, r1);
            return new C61817KNg(DbU.A09(A0F, viewGroup, R.layout.layout_share_content_funding_item, false), r1);
        } else {
            throw DbW.A0a(AnonymousClass000.A00(4145), i);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C60501JmY jmY = (C60501JmY) r5;
        0qQ.A0B(jmY, 0);
        C61016JvG jvG = (C61016JvG) this.A02.get(i);
        if (jmY instanceof C61818KNh) {
            C61818KNh kNh = (C61818KNh) jmY;
            0qQ.A0B(jvG, 0);
            IgdsListCell igdsListCell = kNh.A01;
            if (igdsListCell != null) {
                igdsListCell.A0I(C66909Mes.A00(JTQ.A06(kNh), jvG.A03));
                igdsListCell.A0H(C66909Mes.A00(JTQ.A06(kNh), jvG.A02));
                igdsListCell.setChecked(jvG.A00);
                igdsListCell.setEnabled(jvG.A04);
                igdsListCell.A0D(new LZI(2, kNh, jvG));
            }
            if (jvG.A05) {
                AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(kNh.A00, 2131953939);
                A0e.A03(JTO.A0F(kNh));
                A0e.A02();
                A0e.A0A = true;
                A0e.A04 = new KSN(1, jvG, kNh);
                kNh.itemView.postDelayed(new C65895M3k(A0e.A00()), 500);
                return;
            }
            return;
        }
        C61817KNg kNg = (C61817KNg) jmY;
        0qQ.A0B(jvG, 0);
        IgdsListCell igdsListCell2 = kNg.A00;
        if (igdsListCell2 != null) {
            igdsListCell2.setChecked(jvG.A00);
            igdsListCell2.A0D(new LZI(1, kNg, jvG));
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(526879990);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-1892340313, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-855427151);
        int i2 = 1;
        if (i != this.A02.size() - 1) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(-984411812, A032);
        return i2;
    }
}
