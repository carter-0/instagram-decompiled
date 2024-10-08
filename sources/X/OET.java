package X;

import android.content.Context;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;
import java.util.Timer;

public final class OET {
    public IgRadioTsLoggerEngine A00;
    public final Timer A01;
    public final TslogStreamApi A02;

    public OET(Context context, TslogEngineApi tslogEngineApi, UserSession userSession) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(context2, userSession2);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession2, 36323350171102310L);
        boolean A062 = 182.A06(r2, userSession2, 36323350171167847L);
        long A012 = 182.A01(r2, userSession2, 36604825148003438L);
        long A013 = 182.A01(r2, userSession2, 36604825148068975L);
        TslogStreamApi createStream = tslogEngineApi.createStream("radio_signals", 10);
        0qQ.A07(createStream);
        this.A02 = createStream;
        Timer timer = new Timer();
        this.A01 = timer;
        if (A06 || A062) {
            this.A00 = new IgRadioTsLoggerEngine(context2, userSession2, createStream, A06, A062);
            timer.scheduleAtFixedRate(new Y5e(this), A012, A013);
        }
    }
}
