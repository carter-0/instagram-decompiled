package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.android.R;
import java.util.Map;

public final class S7M {
    public C11663Se6 A00;
    public final 2FO A01;
    public final C10256RpG A02;
    public final SIS A03;
    public final C10987S3z A04;
    public final Context A05;
    public final SSL A06;
    public final SSL A07;
    public final SDc A08;
    public final SOC A09;
    public final AnonymousClass5A3 A0A;
    public final C10634RvT A0B;

    public final SSY A01(Fragment fragment) {
        AnonymousClass5A3 r5 = this.A0A;
        return new SSY(SSY.A08, fragment, (FragmentActivity) null, this, r5);
    }

    public final SSY A02(FragmentActivity fragmentActivity) {
        AnonymousClass5A3 r5 = this.A0A;
        return new SSY(SSY.A08, (Fragment) null, fragmentActivity, this, r5);
    }

    public final C11663Se6 A00() {
        C11663Se6 se6 = this.A00;
        if (se6 != null) {
            return se6;
        }
        Context context = this.A05;
        SIS sis = this.A03;
        SSL ssl = this.A07;
        SSL ssl2 = this.A06;
        C10634RvT rvT = this.A0B;
        C11663Se6 se62 = new C11663Se6(context, ssl, ssl2, sis, this.A09, this.A0A, rvT);
        this.A00 = se62;
        return se62;
    }

    public final C12464Suw A03(Context context, Class cls) {
        Number number;
        int intValue;
        SDc sDc = this.A08;
        if (context == null) {
            context = this.A05;
        }
        if (cls.equals(QmV.class)) {
            return new C12464Suw(new C12465Sux(context, SDc.A00(sDc, cls)), R.layout.fbpay_auth_cvv);
        }
        if (cls.equals(QmX.class)) {
            return new C12464Suw(new C12465Sux(context, SDc.A00(sDc, cls)), R.layout.fbpay_auth_settings_fragment);
        }
        if (cls.equals(QmY.class)) {
            int A002 = SDc.A00(sDc, cls);
            AnonymousClass34S r0 = (AnonymousClass34S) sDc.A00.get(cls);
            if (r0 != null && (number = (Number) r0.A01) != null && (intValue = number.intValue()) != 0) {
                return new C12464Suw(new C12465Sux(context, A002), intValue);
            }
            throw C51973G9u.A0g(cls, "Layout is not provided for Fragment Decorator!", AnonymousClass7TE.A1A());
        } else if (cls.equals(QmW.class)) {
            return new C12464Suw(new C12465Sux(context, SDc.A00(sDc, cls)), R.layout.auth_edit_text_screen);
        } else {
            throw C51973G9u.A0g(cls, "Not aware about decorator Class :", AnonymousClass7TE.A1A());
        }
    }

    public final void A04(Bundle bundle) {
        String string = bundle.getString("PAYMENT_TYPE");
        FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) bundle.getParcelable("logger_data");
        if (!TextUtils.isEmpty(string) && fBPayLoggerData != null) {
            C10634RvT rvT = this.A0B;
            string.getClass();
            Map map = rvT.A02;
            0qQ.A06(map);
            Object obj = map.get(string);
            if (obj == null) {
                obj = new SHU(rvT.A00, rvT.A01);
                map.put(string, obj);
            }
            ((SHU) obj).A00(fBPayLoggerData, AnonymousClass05K.A01, string);
        }
        SIS sis = this.A03;
        sis.A01();
        C8274QnG qnG = sis.A00.A01.A01;
        SSC.A04(qnG.A03.A00, qnG);
    }

    public S7M(Context context, SSL ssl, SSL ssl2, 2FO r5, SDc sDc, SIS sis, C10987S3z s3z, SOC soc, AnonymousClass5A3 r10, C10634RvT rvT) {
        this.A05 = context;
        this.A03 = sis;
        this.A04 = s3z;
        this.A01 = r5;
        this.A08 = sDc;
        this.A07 = ssl;
        this.A06 = ssl2;
        this.A0B = rvT;
        this.A0A = r10;
        this.A09 = soc;
        this.A02 = new C10256RpG(sis);
    }
}
