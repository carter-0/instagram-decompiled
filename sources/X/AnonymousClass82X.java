package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.MusicAssetBeatInfo;
import com.instagram.music.common.model.WordOffset;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.82X  reason: invalid class name */
public final class AnonymousClass82X implements AnonymousClass81E {
    public ARAudioEffectData A00;
    public boolean A01;
    public final Context A02;
    public final C3497681r A03;
    public final C3496181b A04;
    public final IgCameraEffectsController A05;
    public final C312196dz A06;
    public final AnonymousClass82A A07;
    public final C342847pG A08;
    public final C342837pF A09;
    public final AnonymousClass829 A0A;
    public final UserSession A0B;
    public final AnonymousClass823 A0C;
    public final AnonymousClass0eM A0D;

    public final void A03() {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        igCameraEffectsController.A06 = null;
        igCameraEffectsController.A04 = null;
        igCameraEffectsController.A03 = null;
        igCameraEffectsController.A05 = null;
        C312196dz r0 = this.A06;
        if (r0 != null) {
            r0.ENN((TextView) null);
        }
        C3496181b r2 = this.A04;
        C340397lC r02 = r2.A04;
        if (r02 != null) {
            r02.AOq(true);
        }
        r2.A07.A00 = null;
    }

    public final void A06(AnonymousClass82C r2) {
        0qQ.A0B(r2, 0);
        this.A05.A0Q.add(r2);
    }

    public final void A07(AnonymousClass82C r2) {
        0qQ.A0B(r2, 0);
        this.A05.A0Q.remove(r2);
    }

    public final void A08(AnonymousClass82E r2) {
        0qQ.A0B(r2, 0);
        this.A05.A0R.add(r2);
    }

    public final boolean A0A(MotionEvent motionEvent) {
        C357318Xk A002;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass823 r0 = this.A0C;
        if (!(r0 == null || (A002 = r0.A00()) == null)) {
            A002.A04(true);
        }
        C340397lC r02 = this.A04.A04;
        if (r02 == null || !r02.DsV(motionEvent)) {
            return false;
        }
        return true;
    }

    public AnonymousClass82X(Context context, GalleryPickerServiceDataSource galleryPickerServiceDataSource, C3497681r r5, C3496181b r6, IgCameraEffectsController igCameraEffectsController, C312196dz r8, AnonymousClass82A r9, UserSession userSession, C342847pG r11, C342837pF r12, AnonymousClass823 r13, AnonymousClass829 r14, AnonymousClass0eM r15) {
        0qQ.A0B(r6, 15);
        0qQ.A0B(igCameraEffectsController, 16);
        0qQ.A0B(r15, 17);
        this.A0B = userSession;
        this.A03 = r5;
        this.A0C = r13;
        this.A09 = r12;
        this.A08 = r11;
        this.A0A = r14;
        this.A07 = r9;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = igCameraEffectsController;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A02 = applicationContext;
        this.A0D = r15;
        if (!(r8 == null || galleryPickerServiceDataSource == null)) {
            r8.EXK(galleryPickerServiceDataSource);
        }
        if (!2CC.A00(AnonymousClass05K.A0R)) {
            AnonymousClass82A r1 = this.A07;
            if (r1 != null) {
                r1.A02 = this;
                r1.A01 = this;
                A08(r1.A07);
                A06(r1.A06);
            }
            AnonymousClass82T r16 = this.A05.A0M;
            r16.A03 = this.A09;
            r16.A02 = this.A08;
            r16.A04 = this.A0A;
        }
    }

    public static final void A00(AnonymousClass82X r24, Integer num) {
        AnonymousClass82A r5;
        double d;
        JSONObject jSONObject;
        AnonymousClass82X r1 = r24;
        ARAudioEffectData aRAudioEffectData = r1.A00;
        if (aRAudioEffectData != null && r1.A01 && (r5 = r1.A07) != null) {
            if (r5.A04 || r5.A03) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        List<LyricsPhrase> list = aRAudioEffectData.A01;
                        JSONArray jSONArray = null;
                        if (list == null) {
                            jSONObject = null;
                        } else {
                            JSONArray jSONArray2 = new JSONArray();
                            for (LyricsPhrase lyricsPhrase : list) {
                                if (lyricsPhrase.A02 != null) {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        double d2 = ((double) lyricsPhrase.A00) / 1000.0d;
                                        List list2 = lyricsPhrase.A02;
                                        if (list2 != null) {
                                            jSONObject4.put("startTime", d2);
                                            jSONObject4.put("endTime", (((double) ((WordOffset) 00k.A0K(list2)).A01) / 1000.0d) + d2);
                                            jSONObject4.put("text", lyricsPhrase.A01);
                                            JSONArray jSONArray3 = new JSONArray();
                                            String str = lyricsPhrase.A01;
                                            List<WordOffset> list3 = lyricsPhrase.A02;
                                            if (list3 != null) {
                                                for (WordOffset wordOffset : list3) {
                                                    int i = wordOffset.A02;
                                                    int i2 = wordOffset.A00;
                                                    int i3 = wordOffset.A03;
                                                    int i4 = wordOffset.A01;
                                                    boolean z = wordOffset.A04;
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    String substring = str.substring(i, i2);
                                                    0qQ.A07(substring);
                                                    double d3 = ((double) i3) / 1000.0d;
                                                    double d4 = ((double) i4) / 1000.0d;
                                                    try {
                                                        jSONObject5.put("startIndex", i);
                                                        jSONObject5.put("endIndex", i2);
                                                        jSONObject5.put("hasTrailingWhitespace", z);
                                                        jSONObject5.put("startTimeOffset", d3);
                                                        jSONObject5.put("endTimeOffset", d4);
                                                        jSONObject5.put("wordText", substring);
                                                        jSONArray3.put(jSONObject5);
                                                    } catch (JSONException e) {
                                                        e.getMessage();
                                                    }
                                                }
                                            }
                                            jSONObject4.put("words", jSONArray3);
                                        }
                                    } catch (JSONException e2) {
                                        e2.getMessage();
                                    }
                                    jSONArray2.put(jSONObject4);
                                }
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("phrases", jSONArray2);
                                jSONObject = jSONObject6;
                            } catch (JSONException unused) {
                                jSONObject = null;
                            }
                        }
                        List<MusicAssetBeatInfo> list4 = aRAudioEffectData.A00;
                        if (list4 != null) {
                            JSONArray jSONArray4 = new JSONArray();
                            for (MusicAssetBeatInfo musicAssetBeatInfo : list4) {
                                int i5 = musicAssetBeatInfo.A00;
                                boolean z2 = musicAssetBeatInfo.A03;
                                boolean z3 = musicAssetBeatInfo.A01;
                                boolean z4 = musicAssetBeatInfo.A02;
                                boolean z5 = musicAssetBeatInfo.A04;
                                JSONObject jSONObject7 = new JSONObject();
                                double d5 = ((double) i5) / 1000.0d;
                                try {
                                    jSONObject7.put("is_down_beat_key", z3);
                                    jSONObject7.put("is_phrase_key", z4);
                                    jSONObject7.put("is_strong_key", z2);
                                    jSONObject7.put("is_twobar_key", z5);
                                    jSONObject7.put("time_in_seconds_key", d5);
                                    jSONArray4.put(jSONObject7);
                                } catch (JSONException unused2) {
                                }
                            }
                            jSONArray = jSONArray4;
                        }
                        jSONObject3.put("audioStartTime", aRAudioEffectData.A03);
                        jSONObject3.put("audioDuration", aRAudioEffectData.A02);
                        jSONObject3.put("clipStart", aRAudioEffectData.A05);
                        jSONObject3.put("clipEnd", aRAudioEffectData.A04);
                        jSONObject3.put("audioAssetId", aRAudioEffectData.A07);
                        jSONObject3.put(DialogModule.KEY_TITLE, aRAudioEffectData.A08);
                        jSONObject3.put("artistName", aRAudioEffectData.A06);
                        JSONArray jSONArray5 = jSONArray;
                        if (jSONArray == null) {
                            jSONArray5 = JSONObject.NULL;
                        }
                        jSONObject3.put("beats", jSONArray5);
                        JSONObject jSONObject8 = jSONObject;
                        if (jSONObject == null) {
                            jSONObject8 = JSONObject.NULL;
                        }
                        jSONObject3.put("lyrics", jSONObject8);
                    } catch (JSONException e3) {
                        e3.getMessage();
                    }
                    jSONObject2.put("arAudioEffectData", jSONObject3);
                    AnonymousClass82X r12 = r5.A02;
                    if (r12 != null) {
                        r12.A09(jSONObject2);
                    }
                    r5.A05 = false;
                    if (num != null) {
                        d = (double) num.intValue();
                    } else {
                        d = aRAudioEffectData.A05;
                    }
                    r5.A00 = d;
                } catch (JSONException e4) {
                    e4.getMessage();
                }
            }
        }
    }

    public final CameraAREffect A01() {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        C361848gv r0 = igCameraEffectsController.A07;
        if (r0 == null || !r0.isEnabled()) {
            return null;
        }
        return igCameraEffectsController.A09;
    }

    public final String A02() {
        HashMap hashMap = new HashMap(this.A05.A0H.A00);
        if (hashMap.isEmpty()) {
            return null;
        }
        return new JSONObject(hashMap).toString();
    }

    public final void A04(int i) {
        AnonymousClass82A r5 = this.A07;
        if (r5 == null) {
            return;
        }
        if (r5.A04 || r5.A03 || r5.A05) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("audioTime", (((double) i) / 1000.0d) + r5.A00);
                AnonymousClass82X r0 = r5.A02;
                if (r0 != null) {
                    r0.A09(jSONObject);
                }
            } catch (JSONException e) {
                e.getMessage();
            }
        }
    }

    public final void A05(C357848Zx r2) {
        IgCameraEffectsController igCameraEffectsController = this.A05;
        igCameraEffectsController.A01 = r2;
        C361848gv r0 = igCameraEffectsController.A07;
        if (r0 != null) {
            r0.A0F(r2);
        }
    }

    public final void A09(JSONObject jSONObject) {
        AnonymousClass82S r0 = this.A05.A0G;
        0qQ.A07(r0);
        r0.A00(jSONObject);
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        CameraEffectFacadeIntf$State cameraEffectFacadeIntf$State = (CameraEffectFacadeIntf$State) parcelable;
        if (cameraEffectFacadeIntf$State != null) {
            this.A00 = cameraEffectFacadeIntf$State.A00;
            this.A01 = cameraEffectFacadeIntf$State.A01;
        }
        AnonymousClass82A r1 = this.A07;
        if (r1 != null) {
            r1.A02 = this;
            r1.A01 = this;
            A08(r1.A07);
            A06(r1.A06);
        }
        AnonymousClass82T r12 = this.A05.A0M;
        r12.A03 = this.A09;
        r12.A02 = this.A08;
        r12.A04 = this.A0A;
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        AnonymousClass82A r2 = this.A07;
        if (r2 != null) {
            r2.A02 = null;
            r2.A01 = null;
            AnonymousClass82E r1 = r2.A07;
            0qQ.A0B(r1, 0);
            this.A05.A0R.remove(r1);
            A07(r2.A06);
        }
        AnonymousClass82T r12 = this.A05.A0M;
        r12.A03 = null;
        r12.A02 = null;
        r12.A04 = null;
        return new CameraEffectFacadeIntf$State(this.A00, this.A01);
    }
}
