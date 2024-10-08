package X;

import android.net.Uri;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import java.util.Map;

/* renamed from: X.9YF  reason: invalid class name */
public final class AnonymousClass9YF extends 2YL implements C41833B2o {
    public final long A00;
    public final IabCommonTrait A01;
    public final IABViewModeLaunchConfig A02;
    public final String A03;
    public final Map A04;
    public final long A05;
    public final Uri A06;
    public final AnonymousClass2Fj A07;
    public final AnonymousClass2Fj A08 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A09 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A0A = new AnonymousClass2Fj();

    public final AnonymousClass2Fj Avi() {
        return this.A08;
    }

    public final AnonymousClass2Fj BH6() {
        return this.A09;
    }

    public final long BYU() {
        return this.A05;
    }

    public final AnonymousClass2Fj CCh() {
        return this.A0A;
    }

    public final String getSessionId() {
        return this.A03;
    }

    public AnonymousClass9YF(Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, String str, Map map, long j, long j2) {
        this.A06 = uri;
        this.A02 = iABViewModeLaunchConfig;
        this.A01 = iabCommonTrait;
        this.A00 = j;
        this.A04 = map;
        this.A03 = str;
        this.A05 = j2;
        this.A07 = new 2Fk(uri.toString());
    }
}
