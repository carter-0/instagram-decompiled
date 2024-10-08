package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.JlJ  reason: case insensitive filesystem */
public final class C60426JlJ extends 2Rw {
    public boolean A00 = true;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final ClipsCreationViewModel A03;
    public final Integer A04;
    public final String A05;
    public final C357588Yu[] A06;

    public C60426JlJ(AnonymousClass0iw r3, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, Integer num, String str, C357588Yu[] r8) {
        AnonymousClass7TF.A1C(r8, 1, userSession);
        0qQ.A0B(num, 6);
        this.A06 = r8;
        this.A03 = clipsCreationViewModel;
        this.A01 = r3;
        this.A05 = str;
        this.A04 = num;
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void onBindViewHolder(C249703kE r9, int i) {
        C60659Jp6 jp6;
        C357588Yu r2;
        int i2;
        AnonymousClass0Ud r0;
        int i3;
        0qQ.A0B(r9, 0);
        int i4 = r9.mItemViewType;
        if (i4 == 0) {
            jp6 = (C60659Jp6) r9;
            r2 = null;
        } else if (i4 == 1) {
            if (i > 0) {
                int i5 = i - 1;
                C357588Yu[] r22 = this.A06;
                if (i5 < r22.length) {
                    jp6 = (C60659Jp6) r9;
                    r2 = r22[i - 1];
                }
            }
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(26));
        } else {
            throw AnonymousClass7TE.A0w("Invalid voice effect.");
        }
        ImageView imageView = jp6.A01;
        C60426JlJ jlJ = jp6.A04;
        imageView.setEnabled(jlJ.A00);
        TextView textView = jp6.A02;
        textView.setEnabled(jlJ.A00);
        if (r2 != null) {
            i2 = r2.A02;
        } else {
            i2 = R.drawable.instagram_spark_none_outline_32;
        }
        int intValue = jp6.A05.intValue();
        if (intValue == 2 || intValue == 0) {
            r0 = jp6.A03.A0K.A0c;
        } else {
            r0 = jp6.A03.A0K.A0m;
        }
        if (r2 != r0.getValue() || !jlJ.A00) {
            imageView.setImageResource(i2);
            jp6.itemView.setSelected(false);
            jp6.A00.setVisibility(8);
        } else {
            imageView.setImageDrawable(F62.A00(JTQ.A06(jp6), i2));
            jp6.A00.setVisibility(0);
            jp6.itemView.setSelected(true);
        }
        Context A07 = DbS.A07(jp6);
        if (r2 != null) {
            i3 = r2.A03;
        } else {
            i3 = 2131969670;
        }
        DbT.A18(A07, textView, i3);
        LYG.A02(jp6.itemView, 20, jp6, r2);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0D = DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_voice_effects_grid_item, false);
        if (i == 0 || i == 1) {
            return new C60659Jp6(A0D, this.A03, this, this.A04);
        }
        throw AnonymousClass7TE.A0w("Invalid voice effect.");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-383550324);
        int length = this.A06.length + 1;
        AnonymousClass0fD.A0A(1302778806, A032);
        return length;
    }

    public final long getItemId(int i) {
        AnonymousClass0fD.A0A(-1116542772, AnonymousClass0fD.A03(779194615));
        return 0;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1609086981);
        boolean A1U = C51970G9q.A1U(i);
        AnonymousClass0fD.A0A(593538471, A032);
        return A1U ? 1 : 0;
    }
}
