package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.resources.downloadable.impl.VoltronLanguagePackDownloader;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: X.3j6  reason: invalid class name and case insensitive filesystem */
public final class C249083j6 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249083j6(2Lk r7) {
        super("PrefetchVoltronLanguagePack", 1352867137, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        List list;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        VoltronLanguagePackDownloader voltronLanguagePackDownloader = new VoltronLanguagePackDownloader(context, userSession);
        Locale AcC = C636413p.A00(new C635513f()).AcC();
        if (!AcC.equals(Locale.ENGLISH)) {
            voltronLanguagePackDownloader.A01(AcC);
        }
        List A03 = new 11S(",").A03(182.A04(0Tu.A05, userSession, 36885054584128085L));
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = 00k.A0d(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = 0sn.A00;
        String[] strArr = (String[]) list.toArray(new String[0]);
        C636413p.A00(new C635513f());
        Locale locale = Resources.getSystem().getConfiguration().locale;
        0qQ.A07(locale);
        if (0sr.A1P(Arrays.copyOf(strArr, strArr.length)).contains(locale.getLanguage())) {
            voltronLanguagePackDownloader.A01(locale);
        }
    }
}
