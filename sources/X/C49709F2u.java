package X;

import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.F2u  reason: case insensitive filesystem */
public final class C49709F2u {
    public C49702F2n A00;
    public E0N A01;
    public String A02;
    public boolean A03 = false;
    public final TextWatcher A04 = new C48054ESy(this, 15);
    public final AutoCompleteTextView A05;
    public final ImageView A06;
    public final TextView A07;
    public final AnonymousClass4DH A08;
    public final 0lg A09;
    public final C46634DiE A0A;

    public final String A00() {
        C49702F2n f2n = this.A00;
        f2n.getClass();
        if (f2n.A04 == null) {
            return "";
        }
        return C49958FGq.A00(this.A00.A04.A00(), 0nA.A0I(this.A05));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.F2n, java.lang.Object] */
    public C49709F2u(AutoCompleteTextView autoCompleteTextView, ImageView imageView, TextView textView, AnonymousClass4DH r6, 0lg r7, CountryCodeData countryCodeData, C46634DiE diE) {
        this.A09 = r7;
        this.A05 = autoCompleteTextView;
        this.A06 = imageView;
        this.A0A = diE;
        this.A07 = textView;
        this.A08 = r6;
        FragmentActivity requireActivity = r6.requireActivity();
        ? obj = new Object();
        obj.A00 = requireActivity;
        obj.A01 = autoCompleteTextView;
        obj.A02 = textView;
        obj.A05 = diE;
        obj.A03 = r7;
        if (countryCodeData == null) {
            obj.A04 = C3270479e.A00(requireActivity);
        } else {
            obj.A04 = countryCodeData;
        }
        this.A00 = obj;
    }
}
