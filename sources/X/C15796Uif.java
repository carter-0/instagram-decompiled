package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGLiveWaveStatus;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Uif  reason: case insensitive filesystem */
public final class C15796Uif extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final G7P A02;
    public final C313666go A03;
    public final X9V A04;
    public final 0sP A05;

    public C15796Uif(AnonymousClass0iw r2, UserSession userSession, G7P g7p, C313666go r5, X9V x9v, 0sP r7) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = x9v;
        this.A05 = r7;
        this.A02 = g7p;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14899UEd(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_iglive_user_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r17, C249703kE r18) {
        View view;
        WSZ wsz = (WSZ) r17;
        C14899UEd uEd = (C14899UEd) r18;
        boolean A1U = AnonymousClass7TF.A1U(0, wsz, uEd);
        int ordinal = this.A03.ordinal();
        if (ordinal == 0) {
            uEd.A04(this.A00, this.A02, this.A04, wsz);
        } else if (ordinal == A1U) {
            UserSession userSession = this.A01;
            AnonymousClass0iw r10 = this.A00;
            0sP r15 = this.A05;
            X9V x9v = this.A04;
            DbZ.A0t(A1U ? 1 : 0, userSession, r10, r15);
            C14899UEd.A03(r10, uEd, wsz);
            Integer num = wsz.A00;
            Integer num2 = AnonymousClass05K.A0j;
            if (num == num2 && wsz.A01.A03.BNR() == IGLiveWaveStatus.WAVE_ELIGIBLE) {
                TextView textView = uEd.A04;
                DbY.A0y(textView.getResources(), textView, "👋", 2131965457);
                textView.setVisibility(0);
                WB4.A00(textView, x9v, wsz, uEd, 69);
            } else if (wsz.A00 == num2 && wsz.A01.A03.BNR() == IGLiveWaveStatus.WAVE_ALREADY_SENT) {
                TextView textView2 = uEd.A04;
                DbY.A0y(textView2.getResources(), textView2, "👋", 2131965457);
                textView2.setVisibility(0);
                textView2.setAlpha(0.3f);
                textView2.setOnClickListener((View.OnClickListener) null);
            } else {
                TextView textView3 = uEd.A04;
                textView3.setOnClickListener((View.OnClickListener) null);
                textView3.setVisibility(8);
            }
            Integer num3 = wsz.A00;
            if (num3 == AnonymousClass05K.A1F || num3 == num2 || num3 == AnonymousClass05K.A02 || num3 == AnonymousClass05K.A03) {
                uEd.A07.setVisibility(8);
            } else {
                C14899UEd.A01(r10, userSession, x9v, uEd, wsz, r15);
                uEd.A07.setVisibility(0);
            }
            Integer num4 = wsz.A00;
            if (num4 == num2 || num4 == AnonymousClass05K.A02 || num4 == AnonymousClass05K.A03) {
                ImageView imageView = uEd.A03;
                imageView.setVisibility(0);
                AnonymousClass0fU.A00(new WBE(x9v, wsz, 32), imageView);
            } else {
                ImageView imageView2 = uEd.A03;
                imageView2.setVisibility(8);
                imageView2.setOnClickListener((View.OnClickListener) null);
            }
            IgdsButton igdsButton = uEd.A05;
            igdsButton.setVisibility(8);
            igdsButton.setOnClickListener((View.OnClickListener) null);
            uEd.A02.setVisibility(8);
            AnonymousClass0fU.A00(new WBE(x9v, wsz, 33), uEd.A01);
        } else if (ordinal == 2) {
            UserSession userSession2 = this.A01;
            AnonymousClass0iw r5 = this.A00;
            0sP r102 = this.A05;
            X9V x9v2 = this.A04;
            0qQ.A0B(userSession2, A1U);
            AnonymousClass7TF.A1C(r5, 2, r102);
            C14899UEd.A03(r5, uEd, wsz);
            C14899UEd.A02(r5, (G7P) null, x9v2, uEd, wsz);
            if (0qQ.A0K(wsz.A01.getId(), userSession2.A06)) {
                IgdsButton igdsButton2 = uEd.A06;
                igdsButton2.setStyle(C273014lo.SECONDARY);
                igdsButton2.setText(uEd.A00.getString(2131963932));
                AnonymousClass0fU.A00(new WBE(x9v2, wsz, 31), igdsButton2);
                igdsButton2.setVisibility(0);
            } else {
                IgdsButton igdsButton3 = uEd.A06;
                igdsButton3.setVisibility(8);
                igdsButton3.setOnClickListener((View.OnClickListener) null);
            }
            if (wsz.A00 == AnonymousClass05K.A0j) {
                uEd.A03.setVisibility(0);
                view = uEd.A07;
            } else {
                C14899UEd.A01(r5, userSession2, x9v2, uEd, wsz, r102);
                view = uEd.A03;
            }
            view.setVisibility(8);
        } else {
            throw new RuntimeException();
        }
    }

    public final Class modelClass() {
        return WSZ.class;
    }
}
