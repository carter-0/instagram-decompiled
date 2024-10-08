package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.JlT  reason: case insensitive filesystem */
public final class C60435JlT extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public List A01 = AnonymousClass7TE.A1C();
    public 1wn A02;
    public 1wn A03;
    public final Context A04;
    public final FragmentActivity A05;
    public final AnonymousClass2k4 A06;
    public final LPH A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;

    public C60435JlT(Context context, FragmentActivity fragmentActivity, AnonymousClass2k4 r4, LPH lph, AnonymousClass0iw r6, UserSession userSession) {
        AnonymousClass7TG.A0w(1, context, r4, userSession);
        this.A04 = context;
        this.A05 = fragmentActivity;
        this.A06 = r4;
        this.A09 = userSession;
        this.A08 = r6;
        this.A07 = lph;
    }

    public static final void A00(C60650Jox jox, C60435JlT jlT, int i) {
        long j = ((long) i) * 1000;
        TextView textView = jox.A03;
        Context context = jlT.A04;
        DbX.A13(context, textView, new SimpleDateFormat("LLL d, h:mm a", Locale.US).format(new Date(j)), 2131972689);
        if (Calendar.getInstance().getTimeInMillis() > j) {
            DbT.A17(context, textView, 2Yu.A03(context));
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60650Jox(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.scheduled_content_list_item, false));
    }

    public final void A02() {
        if (this.A02 != null) {
            1wn r0 = this.A02;
            0qQ.A0A(r0);
            AnonymousClass1Nd.A00(this.A09).A02(r0, C64644LfW.class);
            this.A02 = null;
        }
        if (this.A03 != null) {
            1wn r02 = this.A03;
            0qQ.A0A(r02);
            AnonymousClass1Nd.A00(this.A09).A02(r02, C64666Lfs.class);
            this.A03 = null;
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        ExtendedImageUrl A1m;
        Integer Bpd;
        String str;
        1Xj r0;
        C60650Jox jox = (C60650Jox) r7;
        0qQ.A0B(jox, 0);
        this.A01.set(i, jox);
        1Xj A0T = DbZ.A0T(this.A00, i);
        int dimensionPixelSize = this.A04.getResources().getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
        if (A0T.A0p() > 0) {
            List Alu = A0T.A0C.Alu();
            if (!(Alu == null || (r0 = (1Xj) 00k.A0O(Alu, 0)) == null)) {
                A1m = r0.A1m(dimensionPixelSize);
            }
            C247733gp A1T = A0T.A1T();
            if (!(A1T == null || (str = A1T.A0d) == null || str.length() <= 0)) {
                TextView textView = jox.A02;
                textView.setText(str);
                textView.setVisibility(0);
            }
            DSX Aqj = A0T.A0C.Aqj();
            if (!(Aqj == null || (Bpd = Aqj.Bpd()) == null)) {
                A00(jox, this, Bpd.intValue());
            }
            LY8.A00(jox.A01, 25, A0T, this);
            LY8.A00(jox.A00, 26, A0T, this);
        }
        A1m = A0T.A1m(dimensionPixelSize);
        if (A1m != null) {
            jox.A04.setUrl(this.A09, A1m, this.A08);
        }
        C247733gp A1T2 = A0T.A1T();
        TextView textView2 = jox.A02;
        textView2.setText(str);
        textView2.setVisibility(0);
        DSX Aqj2 = A0T.A0C.Aqj();
        A00(jox, this, Bpd.intValue());
        LY8.A00(jox.A01, 25, A0T, this);
        LY8.A00(jox.A00, 26, A0T, this);
    }

    public final void A01() {
        A02();
        this.A02 = C64698LgT.A00(this, 4);
        this.A03 = C64698LgT.A00(this, 5);
        UserSession userSession = this.A09;
        1wn r0 = this.A02;
        0qQ.A0A(r0);
        AnonymousClass1Nd.A00(userSession).A01(r0, C64644LfW.class);
        1wn r02 = this.A03;
        0qQ.A0A(r02);
        AnonymousClass1Nd.A00(userSession).A01(r02, C64666Lfs.class);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-173751447);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-122784362, A032);
        return size;
    }
}
