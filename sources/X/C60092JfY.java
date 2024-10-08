package X;

import android.app.Application;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import java.util.List;
import java.util.Locale;

/* renamed from: X.JfY  reason: case insensitive filesystem */
public final class C60092JfY extends C361478gI {
    public List A00;
    public final ContentLanguageSettingsRepository A01;
    public final Locale A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05 = DbS.A10(new C61232JzQ(0sn.A00));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60092JfY(Application application, ContentLanguageSettingsRepository contentLanguageSettingsRepository, Locale locale) {
        super(application);
        0qQ.A0B(application, 3);
        this.A01 = contentLanguageSettingsRepository;
        this.A02 = locale;
        1HR A0w = G9w.A0w();
        this.A03 = A0w;
        this.A04 = 0u9.A04(A0w);
    }
}
