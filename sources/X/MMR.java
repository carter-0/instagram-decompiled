package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.DynamicLayout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.music.common.model.MusicSearchPlaylist;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class MMR extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMR(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MMR(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ViewStub viewStub;
        S0L s0l;
        switch (this.A00) {
            case 0:
                ((C64711Lgk) this.A01).A0M.A03(-2);
                return C60340gF.A00;
            case 1:
                return new Handler(((C60433JlQ) this.A01).A03.getMainLooper());
            case 2:
                return new Handler(((C60407Jl0) this.A01).A03.getMainLooper());
            case 3:
                return DbU.A0Z((View) this.A01, R.id.clips_editor_item_effect_picker_stub);
            case 4:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return ((C380589Yt) this.A01).A01;
            case 5:
                return AnonymousClass7TF.A0G(AnonymousClass7TG.A0Q(((C380589Yt) this.A01).A09), R.id.clips_editor_transition_effects_rebound_viewpager);
            case 6:
                return AnonymousClass7TF.A0G(AnonymousClass7TG.A0Q(((C380589Yt) this.A01).A09), R.id.clips_editor_transition_effects_shutter_button);
            case 7:
                return AnonymousClass7TF.A0Y(0Tu.A05, ((C60107Jfn) this.A01).A04, 36610404310521850L);
            case 8:
                C60107Jfn jfn = (C60107Jfn) this.A01;
                synchronized (jfn) {
                    s0l = new S0L(new C10387RrO(jfn.A04, 1US.A19));
                }
                return s0l;
            case 9:
                return AnonymousClass7TF.A0R(0Tu.A05, ((C60107Jfn) this.A01).A04, 36328929333755573L);
            case 10:
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (JZC jzc : (List) ((C61062Jw0) this.A01).A01) {
                    MusicSearchPlaylist musicSearchPlaylist = jzc.A0E;
                    if (musicSearchPlaylist != null) {
                        A1C.add(musicSearchPlaylist);
                    }
                }
                return A1C;
            case 11:
                C384919i6 r1 = (C384919i6) this.A01;
                return JTU.A0M(r1, r1.A0P);
            case 13:
                C40401AbY abY = (C40401AbY) this.A01;
                return new AnonymousClass8IG(abY.A05, abY.A04.requireActivity());
            case 15:
                C65104LnR lnR = (C65104LnR) this.A01;
                return new AnonymousClass8IG(lnR.A05, lnR.A04.requireActivity());
            case 17:
                return AnonymousClass7TE.A0c(((C56038Hrl) this.A01).A04).findViewById(R.id.compose_view);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((C56038Hrl) this.A01).A00.inflate();
            case 20:
            case 37:
            case 39:
                return JTR.A0b(this.A01);
            case 21:
                ((0sP) this.A01).invoke(C390759rn.AssetHubCutoutTextSticker);
                return C60340gF.A00;
            case 22:
                View findViewById = ((C40375Ab8) this.A01).A09.A00.findViewById(R.id.clips_debug_overlay_stub);
                if (findViewById instanceof ViewStub) {
                    viewStub = (ViewStub) findViewById;
                } else {
                    viewStub = null;
                }
                return new C71662eb(viewStub);
            case 23:
                return new C389369pK((UserSession) this.A01);
            case 24:
                return new KVS((UserSession) this.A01);
            case 25:
                return Integer.valueOf(AnonymousClass7TG.A05(DbT.A08(this.A01)));
            case 26:
                return C320236s2.A01(DbS.A0B(this.A01), AnonymousClass000.A00(2623));
            case 27:
                K6R k6r = (K6R) this.A01;
                return JTU.A0M(k6r, k6r.A0E);
            case 28:
                K6R k6r2 = (K6R) this.A01;
                FragmentActivity requireActivity = k6r2.requireActivity();
                String A0t = DbS.A0t(k6r2.A0C);
                AnonymousClass0eM r0 = k6r2.A0E;
                UserSession A0l = AnonymousClass7TE.A0l(r0);
                AnonymousClass2Np A002 = AnonymousClass830.A00(k6r2.requireContext(), AnonymousClass7TE.A0l(r0));
                AnonymousClass0xx A0J = DbV.A0J(k6r2);
                AnonymousClass7TG.A1Q(A0l, A002);
                return new C64325La0(requireActivity, A0l, A002, A0t, A0J);
            case 30:
                return this.A01;
            case 31:
                return DbT.A0r(this.A01);
            case 32:
                return DbY.A0I(this.A01);
            case 33:
                CircularProgressImageView circularProgressImageView = (CircularProgressImageView) this.A01;
                C64203LTq lTq = new C64203LTq(circularProgressImageView);
                lTq.A00 = circularProgressImageView;
                lTq.A02.addListener(circularProgressImageView);
                return lTq;
            case 34:
                return new C361278fx[((AnonymousClass0r6[]) this.A01).length];
            case 35:
                return new C353478Hu(JTS.A0J(((K5W) this.A01).A0Y));
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
                return Integer.valueOf(JTO.A07((ClipsCreationViewModel) this.A01));
            case 43:
                ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) this.A01;
                clipsSharingDraftViewModel.A00.A0D(clipsSharingDraftViewModel.A07.A02);
                return C60340gF.A00;
            case 44:
                JTQ.A0x(((ClipsSharingDraftViewModel) this.A01).A03, AnonymousClass7TE.A0u());
                return C60340gF.A00;
            case 45:
                K6O k6o = (K6O) this.A01;
                return JTU.A0M(k6o, k6o.A09);
            case 46:
                K6O k6o2 = (K6O) this.A01;
                return JTS.A0M(k6o2, k6o2.A09);
            case 49:
                Path A0C = C51965G9l.A0C();
                C17907Vhy vhy = (C17907Vhy) this.A01;
                DynamicLayout dynamicLayout = vhy.A01;
                float lineLeft = dynamicLayout.getLineLeft(0);
                float lineBaseline = (float) dynamicLayout.getLineBaseline(0);
                TextPaint textPaint = vhy.A03;
                SpannableStringBuilder spannableStringBuilder = vhy.A02;
                textPaint.getTextPath(spannableStringBuilder.toString(), 0, spannableStringBuilder.length(), lineLeft, lineBaseline, A0C);
                ArrayList A07 = 0mp.A07(DbT.A10(spannableStringBuilder));
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it = A07.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (AnonymousClass7TE.A0M(next) >= 0) {
                        A1C2.add(next);
                    }
                }
                Iterator it2 = A1C2.iterator();
                while (it2.hasNext()) {
                    int A0F = AnonymousClass7TG.A0F(it2);
                    float measureText = textPaint.measureText(spannableStringBuilder, 0, A0F);
                    Rect A0W = AnonymousClass7TE.A0W();
                    String obj = spannableStringBuilder.toString();
                    int i2 = A0F + 2;
                    int length = spannableStringBuilder.length();
                    if (i2 > length) {
                        i2 = length;
                    }
                    textPaint.getTextBounds(obj, A0F, i2, A0W);
                    RectF rectF = new RectF(A0W);
                    rectF.offset(measureText + lineLeft, lineBaseline);
                    A0C.addRect(rectF, Path.Direction.CW);
                }
                return A0C;
            default:
                return C51971G9r.A0U(this.A01);
        }
    }
}
