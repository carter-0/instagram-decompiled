package X;

import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;

public final class TJD implements Runnable {
    public final /* synthetic */ C7902QcU A00;
    public final /* synthetic */ C12019Skg A01;
    public final /* synthetic */ String A02;

    public TJD(C7902QcU qcU, C12019Skg skg, String str) {
        this.A01 = skg;
        this.A00 = qcU;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QcU, android.webkit.WebView] */
    public final void run() {
        InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = this.A01.A00;
        instantExperiencesBrowserChrome.A06.setText(this.A00.getTitle());
        instantExperiencesBrowserChrome.A05.setText(this.A02);
        instantExperiencesBrowserChrome.A06.setVisibility(0);
        instantExperiencesBrowserChrome.A05.setVisibility(0);
        instantExperiencesBrowserChrome.A04.setVisibility(8);
    }
}
