package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JlB  reason: case insensitive filesystem */
public final class C60418JlB extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final K7F A03;

    public C60418JlB(AnonymousClass0iw r2, UserSession userSession, K7F k7f) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = k7f;
    }

    public final void onBindViewHolder(C249703kE r6, int i) {
        String str;
        if (JTP.A07(this, r6, 0, i) == 1) {
            C60668JpF jpF = (C60668JpF) r6;
            L5J l5j = (L5J) this.A00.get(i);
            AnonymousClass0iw r3 = this.A01;
            0qQ.A0B(l5j, 0);
            User user = l5j.A00;
            String str2 = null;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            jpF.A00 = str;
            User user2 = l5j.A00;
            if (user2 != null) {
                ((IgImageView) AnonymousClass7TE.A14(jpF.A04)).setUrl(user2.Bh3(), r3);
            }
            TextView A0A = JTQ.A0A(jpF.A05);
            User user3 = l5j.A00;
            if (user3 != null) {
                str2 = user3.getUsername();
            }
            A0A.setText(str2);
            JTQ.A0A(jpF.A02).setText(l5j.A01);
            AnonymousClass0eM r0 = jpF.A06;
            DbY.A0y(AnonymousClass7TH.A06(r0).getResources(), JTQ.A0A(r0), "👋", 2131965457);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            return new C60681JpS(DbV.A0D(viewGroup).inflate(R.layout.layout_iglive_fundraiser_donor_empty_state, viewGroup, false), 6);
        }
        if (i == 1) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60668JpF(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_iglive_fundraiser_donor, false), this.A01, this.A03);
        }
        throw DbW.A0b(AnonymousClass000.A00(1052), i);
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0fD.A03(2023427355);
        List list = this.A00;
        if (list.isEmpty()) {
            size = 1;
        } else {
            size = list.size();
        }
        AnonymousClass0fD.A0A(190807290, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.A00.isEmpty() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = 336254245(0x140ad525, float:7.009255E-27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            if (r4 != 0) goto L_0x0012
            java.util.List r0 = r3.A00
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r0 = 2040415947(0x799e46cb, float:1.0272734E35)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60418JlB.getItemViewType(int):int");
    }
}
