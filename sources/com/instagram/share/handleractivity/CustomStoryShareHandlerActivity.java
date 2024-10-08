package com.instagram.share.handleractivity;

import X.00y;
import X.02m;
import X.0Tu;
import X.0kR;
import X.0qQ;
import X.0wb;
import X.15p;
import X.182;
import X.1ES;
import X.1NY;
import X.1OC;
import X.2RR;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass14B;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11105SAg;
import X.C13082TKo;
import X.C2604245p;
import X.C61058Jvw;
import X.C64729Lh6;
import X.C8746R7k;
import X.C9853RiS;
import X.DbS;
import X.DbX;
import X.DbY;
import X.EDW;
import X.FFi;
import X.FZC;
import X.JTO;
import X.LTL;
import X.Pxe;
import X.Pxh;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.HashMap;
import java.util.List;

public final class CustomStoryShareHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public 02m A01;

    public final String getModuleName() {
        return "share_handler";
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.share.handleractivity.CustomStoryShareHandlerActivity, androidx.activity.ComponentActivity, android.app.Activity] */
    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        CustomStoryShareHandlerActivity.super.onNewIntent(intent);
        setIntent(intent);
        A00();
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.share.handleractivity.CustomStoryShareHandlerActivity, android.content.Context, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.SNR] */
    private final void A00() {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        Intent intent = getIntent();
        Intent intent2 = getIntent();
        0qQ.A07(intent2);
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            C61058Jvw A002 = C9853RiS.A00(this, intent2, r0);
            AnonymousClass0wW r2 = this.A00;
            0Tu r3 = 0Tu.A05;
            HashMap hashMap = null;
            if (DbY.A1Y(r3, r2, 36321413140850020L)) {
                str = intent.getStringExtra(AnonymousClass000.A00(538));
            } else {
                str = null;
            }
            02m r1 = this.A01;
            if (r1 != null) {
                if (!r1.isMarkerOn(18951415)) {
                    02m r12 = this.A01;
                    if (r12 != null) {
                        r12.markerStart(18951415);
                        02m r4 = this.A01;
                        if (r4 != null) {
                            r4.markerAnnotate(18951415, "share_handler_type", "internal");
                        }
                    }
                }
                if (DbY.A1Y(r3, this.A00, 36315670769569233L)) {
                    String str4 = A002.A05;
                    if (str4.length() <= 0) {
                        List A0x = DbX.A0x(182.A04(0Tu.A06, this.A00, 36878620723052737L));
                        if (DbY.A1Y(r3, this.A00, 2342158679983394258L)) {
                            str4 = A002.A04;
                        }
                        if (!A0x.contains(str4) && DbY.A1Y(r3, this.A00, 36315670769765843L) && 00y.A0l(str4) == null) {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append("Missing attribution namespace from source app. Extracted source app: ");
                            A1A.append(A002);
                            0wb.A03("CustomStoryShareHandlerActivity", AnonymousClass7TF.A0l(".sourceNamespace", A1A));
                            Intent A0G = Pxe.A0G("android.intent.action.BUG_REPORT");
                            A0G.putExtra("android.intent.extra.BUG_REPORT", "Missing Facebook App ID. For more information, see https://developers.facebook.com/blog/post/2022/10/10/introducing-important-update-to-Instagram-sharing-to-stories/");
                            setResult(0, A0G);
                            Intent A012 = AnonymousClass14B.A03.A00().A01(this);
                            A012.putExtra(AnonymousClass000.A00(1032), intent);
                            A012.putExtra("StoryHandlerActivity.EXTRA_MISSING_FB_APP_ID", true);
                            0kR.A00.A07().A0G(this, A012);
                            str2 = "no_attribution_namespace";
                            A01(this, str2);
                            finish();
                            return;
                        }
                    }
                }
                AnonymousClass0wW r14 = this.A00;
                if (r14 != null) {
                    String str5 = A002.A04;
                    0qQ.A0B(str5, 0);
                    if ("com.facebook.fundraiser.share".equals(str5)) {
                        ? obj = new Object();
                        0qQ.A0A(intent);
                        AnonymousClass7TF.A1H(intent, r14);
                        LTL.A05(this, new FZC(3, this, intent, r14, obj), 2RR.A02(this, false), 0.2f, -11033345, -1965836, false);
                        if (182.A06(r3, r14, 36315507560811778L)) {
                            String A003 = AnonymousClass000.A00(148);
                            String stringExtra = intent.getStringExtra(A003);
                            if (stringExtra != null) {
                                1NY r32 = new 1NY(r14, -2);
                                r32.A05();
                                r32.A0K("fundraiser/%s/viewer_info_for_linked_fundraiser_sticker/", new Object[]{stringExtra});
                                r32.A9m(A003, stringExtra);
                                r32.A0O((15p) null, C8746R7k.class, C11105SAg.class, false);
                                1OC A0M = r32.A0M();
                                A0M.A00 = new EDW(11, this, intent, r14, obj);
                                1ES.A03(A0M);
                                return;
                            }
                            return;
                        }
                        obj.A01 = false;
                        return;
                    }
                    Uri data = intent.getData();
                    Uri uri = (Uri) intent.getParcelableExtra("interactive_asset_uri");
                    String stringExtra2 = intent.getStringExtra("top_background_color");
                    String stringExtra3 = intent.getStringExtra("bottom_background_color");
                    try {
                        i = Color.parseColor(stringExtra2);
                    } catch (Exception unused) {
                        i = -16777216;
                    }
                    try {
                        i2 = Color.parseColor(stringExtra3);
                    } catch (Exception unused2) {
                        i2 = -16777216;
                    }
                    if (0qQ.A0K(getCallingPackage(), FFi.A00(getPackageManager()))) {
                        Integer[] A004 = AnonymousClass05K.A00(3);
                        int length = A004.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                switch (JTO.A0A(A004, i3)) {
                                    case 1:
                                        str3 = "com.facebook.events";
                                        break;
                                    case 2:
                                        str3 = "com.facebook.feed";
                                        break;
                                    default:
                                        str3 = "com.facebook.groups";
                                        break;
                                }
                                if (str3.equals(str5)) {
                                    hashMap = AnonymousClass7TE.A1E();
                                    Pxh.A14(intent, AnonymousClass000.A00(3108), hashMap);
                                    Pxh.A14(intent, "fb_community_id", hashMap);
                                    Pxh.A14(intent, "fb_community_subtype", hashMap);
                                    Pxh.A14(intent, "fb_community_author_id", hashMap);
                                    Pxh.A14(intent, "fb_community_url", hashMap);
                                    Pxh.A14(intent, "fb_community_mib_extid", hashMap);
                                    Pxh.A14(intent, "fb_community_reshare_session_id", hashMap);
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if ((data == null || data == Uri.EMPTY) && (uri == null || uri == Uri.EMPTY)) {
                        str2 = "invalid_asset_uri";
                        A01(this, str2);
                        finish();
                        return;
                    }
                    C13082TKo tKo = new C13082TKo(intent, data, uri, A002, r14, this, str, hashMap, i, i2);
                    if (C2604245p.A03(this)) {
                        tKo.run();
                        return;
                    } else {
                        C2604245p.A01(this, new C64729Lh6(8, tKo, this));
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            0qQ.A0F("quickPerformanceLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A01(CustomStoryShareHandlerActivity customStoryShareHandlerActivity, String str) {
        02m r0 = customStoryShareHandlerActivity.A01;
        if (r0 != null) {
            if (r0.isMarkerOn(18951415)) {
                02m r1 = customStoryShareHandlerActivity.A01;
                if (r1 != null) {
                    r1.markerAnnotate(18951415, TraceFieldType.FailureReason, str);
                    02m r12 = customStoryShareHandlerActivity.A01;
                    if (r12 != null) {
                        r12.markerEnd(18951415, 3);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("quickPerformanceLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(850251905);
        super.onCreate(bundle);
        this.A00 = DbS.A0S(this);
        this.A01 = 02m.A0p;
        A00();
        AnonymousClass0fD.A07(-1310808178, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
