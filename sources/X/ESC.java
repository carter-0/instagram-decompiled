package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.instagram.release.buildinfo.BuildInfoStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public final class ESC extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BuildInfoFragment";
    public AnonymousClass9FM A00;
    public BuildInfoStore A01;
    public final String A02 = "https://fburl.com/w6e3v6dq";
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final C70944OSr A04 = new C70944OSr(true);
    public final SimpleDateFormat A05 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    public static C50989Fmc A07(Context context, ESC esc, String str, int i) {
        return new C50989Fmc(context, (View.OnClickListener) null, (CharSequence) esc.A06(str, i));
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131954350);
    }

    public final String getModuleName() {
        return "appversion";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C50989Fmc fmc;
        String format;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        String obj = 0la.A02.A00().toString();
        String A042 = C61120lW.A04(requireContext());
        String A022 = C61120lW.A02(requireContext());
        String valueOf = String.valueOf(C61120lW.A00());
        String valueOf2 = String.valueOf(requireContext().getApplicationInfo().targetSdkVersion);
        SimpleDateFormat simpleDateFormat = this.A05;
        String format2 = simpleDateFormat.format(new Date(C61120lW.A01(requireContext())));
        C46448DfA A002 = C46448DfA.A00(2131954348);
        C50989Fmc fmc2 = new C50989Fmc(requireContext(), (View.OnClickListener) null, (CharSequence) A06(A042, 2131954364));
        C50989Fmc A07 = A07(requireContext(), this, obj, 2131954351);
        C50989Fmc A072 = A07(requireContext(), this, A022, 2131954347);
        C50989Fmc A073 = A07(requireContext(), this, valueOf, 2131954349);
        Context requireContext = requireContext();
        0qQ.A0A(format2);
        ArrayList A1M = 0sr.A1M(new Object[]{A002, fmc2, A07, A072, A073, A07(requireContext, this, format2, 2131954352), A07(requireContext(), this, valueOf2, 2131954361)});
        if (182.A06(0Tu.A05, DbT.A0X(this.A03), 36316723036623473L)) {
            ArrayList A1M2 = 0sr.A1M(new Object[]{this.A04, C46448DfA.A00(2131954359)});
            BuildInfoStore buildInfoStore = this.A01;
            String str = "buildInfoStore";
            if (buildInfoStore != null) {
                AnonymousClass9J7 r9 = buildInfoStore.A01;
                if (r9.A01 == 0 || buildInfoStore.A00 < System.currentTimeMillis() - 3600000) {
                    buildInfoStore.A01();
                    BuildInfoStore buildInfoStore2 = this.A01;
                    if (buildInfoStore2 != null) {
                        long j = buildInfoStore2.A00;
                        if (j == 0) {
                            format = "Never";
                        } else {
                            format = simpleDateFormat.format(new Date(j));
                        }
                        Context requireContext2 = requireContext();
                        0qQ.A0A(format);
                        fmc = A07(requireContext2, this, format, 2131954358);
                    }
                } else {
                    C50989Fmc A074 = A07(requireContext(), this, r9.A04, 2131954364);
                    C50989Fmc A075 = A07(requireContext(), this, String.valueOf(r9.A01), 2131954349);
                    Context requireContext3 = requireContext();
                    String format3 = simpleDateFormat.format(new Date(((long) r9.A02) * 1000));
                    0qQ.A07(format3);
                    A1M2.addAll(0sr.A1P(new C50989Fmc[]{A074, A075, A07(requireContext3, this, format3, 2131954352)}));
                    AnonymousClass9FM r0 = this.A00;
                    if (r0 == null) {
                        str = "buildUpdater";
                    } else {
                        if (r0.A00 < r0.A02.A01.A01) {
                            fmc = C50989Fmc.A00(requireContext(), new FP2((Object) this, 34), 2131954354);
                        }
                        A1M.addAll(A1M2);
                    }
                }
                A1M2.addAll(AnonymousClass7TE.A1I(fmc));
                A1M.addAll(A1M2);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C70944OSr oSr = this.A04;
        A1M.addAll(0sr.A1P(new Object[]{oSr, C46448DfA.A00(2131954362), C50989Fmc.A00(requireContext(), new FP2((Object) this, 38), 2131954363), C50989Fmc.A00(requireContext(), new FP2((Object) this, 39), 2131954360)}));
        A1M.addAll(0sr.A1P(new Object[]{oSr, C46448DfA.A00(2131954353), C50989Fmc.A00(requireContext(), new FP2((Object) this, 35), 2131954356), C50989Fmc.A00(requireContext(), new FP2((Object) this, 36), 2131954357), C50989Fmc.A00(requireContext(), new FP2((Object) this, 37), 2131954355)}));
        setItems(A1M);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    private final SpannableString A06(String str, int i) {
        String A16 = AnonymousClass7TE.A16(requireContext(), i);
        String A0g = 002.A0g(A16, ": ", str);
        SpannableString spannableString = new SpannableString(A0g);
        spannableString.setSpan(new ForegroundColorSpan(Dbb.A05(this)), A16.length() + 2, DbX.A05(A0g), 34);
        return spannableString;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1159444912);
        super.onCreate(bundle);
        AnonymousClass0eM r1 = this.A03;
        this.A01 = AnonymousClass9FG.A00(AnonymousClass7TE.A0l(r1));
        this.A00 = AnonymousClass9FL.A00(AnonymousClass7TE.A0l(r1));
        AnonymousClass0fD.A09(-2014722694, A022);
    }
}
