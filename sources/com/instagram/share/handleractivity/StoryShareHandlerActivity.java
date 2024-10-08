package com.instagram.share.handleractivity;

import X.02m;
import X.0Tu;
import X.0lg;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C61058Jvw;
import X.C9853RiS;
import X.C9854RiT;
import X.DbS;
import X.DbY;
import X.TE6;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StoryShareHandlerActivity extends IgActivity implements AnonymousClass0iw {
    public 0lg A00;
    public 02m A01;

    private final void A00() {
        List parcelableArrayListExtra;
        String str;
        Intent intent = getIntent();
        if ("android.intent.action.SEND_MULTIPLE".equals(intent.getAction()) || 0qQ.A0K(intent.getAction(), "com.instagram.share.ADD_TO_STORY_MULTIPLE")) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        } else {
            parcelableArrayListExtra = AnonymousClass7TE.A1I(intent.getParcelableExtra("android.intent.extra.STREAM"));
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (parcelableArrayListExtra != null) {
            for (Object next : parcelableArrayListExtra) {
                if (next != null) {
                    A1C.add(next);
                }
            }
        }
        Intent intent2 = getIntent();
        0qQ.A07(intent2);
        0lg r0 = this.A00;
        if (r0 != null) {
            C61058Jvw A002 = C9853RiS.A00(this, intent2, r0);
            02m r02 = this.A01;
            str = "quickPerformanceLogger";
            String str2 = null;
            if (r02 != null) {
                if (!r02.isMarkerOn(18951415)) {
                    02m r03 = this.A01;
                    if (r03 != null) {
                        r03.markerStart(18951415);
                        02m r2 = this.A01;
                        if (r2 != null) {
                            r2.markerAnnotate(18951415, "share_handler_type", "OS");
                        }
                    }
                }
                0lg r3 = this.A00;
                if (r3 != null) {
                    if (DbY.A1Y(0Tu.A05, r3, 36321413140850020L)) {
                        str2 = intent.getStringExtra(AnonymousClass000.A00(538));
                    }
                    0lg r8 = this.A00;
                    if (r8 != null) {
                        C9854RiT.A00(this, intent, (Uri) null, A002, r8, new TE6(this), str2, (HashMap) null, A1C, -16777216, -16777216);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "session";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "share_handler";
    }

    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(2094589868);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        0qQ.A0B(A0S, 0);
        this.A00 = A0S;
        this.A01 = 02m.A0p;
        A00();
        AnonymousClass0fD.A07(-172127595, A002);
    }
}
