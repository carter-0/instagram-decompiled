package X;

import android.graphics.Bitmap;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.LinkedList;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JYl  reason: case insensitive filesystem */
public final class C59792JYl extends 2Rw implements MS3 {
    public static final 0bY A0B = new 1Q7("IgSecureUriParser").A00;
    public C60694Jpf A00 = null;
    public boolean A01 = false;
    public final FragmentActivity A02;
    public final AnonymousClass2Fj A03 = JTO.A0K();
    public final UserSession A04;
    public final C59941Jc5 A05;
    public final MV4 A06;
    public final C353278Gz A07;
    public final LinkedList A08 = new LinkedList();
    public final Map A09 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eK A0A;

    public final boolean DM9(int i, int i2) {
        LinkedList linkedList = this.A08;
        linkedList.add(i2, linkedList.remove(i));
        notifyItemMoved(i, i2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.creation.photo.crop.LayoutImageView, X.JVz, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.JbJ, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r18, int i) {
        C65152LoH loH;
        C60694Jpf jpf = (C60694Jpf) r18;
        C63873LAc lAc = (C63873LAc) this.A08.get(i);
        this.A02.getLifecycle().A09(jpf);
        if (this.A06.CRJ()) {
            loH = new C65152LoH(jpf, this, lAc);
        } else {
            loH = null;
        }
        lAc.getClass();
        Map map = this.A09;
        L6E l6e = new L6E(jpf, this, lAc);
        jpf.A04 = null;
        ? r8 = jpf.A0G;
        r8.setTranslationY(0.0f);
        r8.setTranslationX(0.0f);
        r8.A04 = false;
        r8.A02 = r8.A01;
        r8.A01 = true;
        jpf.A03();
        r8.setVisibility(8);
        TextureView textureView = jpf.A01;
        if (textureView != null) {
            textureView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = jpf.A09;
        C71492dQ r5 = lAc.A02;
        constraintLayout.setLayoutParams(r5);
        C349307zv r0 = lAc.A05;
        int i2 = 0;
        if (r0 != null) {
            jpf.A02 = r0;
            jpf.A04 = r0.A0k;
            if (jpf.A01 == null) {
                FragmentActivity fragmentActivity = jpf.A0A;
                0qQ.A0B(fragmentActivity, 1);
                TextureView textureView2 = new TextureView(fragmentActivity);
                if (loH != null) {
                    U02 u02 = new U02();
                    u02.A00 = 1.0f;
                    u02.A01 = new GestureDetector(textureView2.getContext(), new C60032Jdi(loH, 3));
                    u02.A02 = new C64927LkS(loH, 0);
                    textureView2.setOnTouchListener(u02);
                }
                jpf.A01 = textureView2;
                textureView2.setSurfaceTextureListener(new LWa(jpf));
                constraintLayout.addView(jpf.A01, 0);
            }
            TextureView textureView3 = jpf.A01;
            textureView3.getClass();
            textureView3.setVisibility(0);
            jpf.A01.setLayoutParams(r5);
            jpf.A01.setTransform(lAc.A01);
            C60694Jpf.A00(jpf);
        } else {
            if (loH != null) {
                r8.A00 = loH;
            }
            String str = lAc.A06;
            if (str != null) {
                C59861Jad jad = (C59861Jad) map.get(str);
                C63809L7p l7p = lAc.A04;
                int i3 = (int) l7p.A03;
                int i4 = (int) l7p.A00;
                if (jad != null) {
                    r8.setVisibility(0);
                    r8.setLayoutParams(r5);
                    FragmentActivity fragmentActivity2 = jpf.A0A;
                    Bitmap bitmap = jad.A00;
                    ExifImageData exifImageData = jad.A01;
                    if (exifImageData != null) {
                        i2 = exifImageData.A00;
                    }
                    C364808m2 r3 = jad.A02;
                    if (bitmap == null) {
                        C59689JTv.A0F(fragmentActivity2, "unable_to_load_image", 2131975828);
                        return;
                    } else if (fragmentActivity2 != null && !fragmentActivity2.isFinishing() && r3 != null) {
                        r8.A0O(i3, i4, bitmap, i2);
                        return;
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass07i.A00(jpf.A0A).A04(new C64328La3(l6e, jpf, str, i3, i4), jpf.A06);
                }
            }
            Bitmap bitmap2 = lAc.A00;
            if (bitmap2 == null) {
                0kD.A01("LayoutCaptureGridAdapter", "both image bitmap and video are null");
            } else {
                r8.setVisibility(0);
                View view = jpf.A07;
                view.setVisibility(0);
                bitmap2.getHeight();
                bitmap2.getWidth();
                r8.A0P(bitmap2, 0);
                r8.A0N();
                r8.setLayoutParams(r5);
                DbT.A16(jpf.A0A, view, R.color.design_dark_default_color_on_background);
                ? obj = new Object();
                obj.A01 = bitmap2;
                obj.A00 = 0;
                r8.setImageRotateBitmapResetBase(obj, (float[]) null, r5);
                view.setVisibility(0);
                view.animate().cancel();
                view.setAlpha(0.25f);
                view.animate().alpha(0.0f).setDuration(500).start();
            }
        }
        LY0.A00(jpf.A0D, 49, l6e);
        C60694Jpf.A02(jpf, lAc);
        LYA.A01(jpf.A08, lAc, jpf, l6e, 16);
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r3) {
        AnonymousClass2Fj r1 = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r1.A09(((C60694Jpf) r3).A0B);
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C249703kE r3) {
        AnonymousClass2Fj r1 = this.A03;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r1.A08(((C60694Jpf) r3).A0B);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.creation.photo.crop.LayoutImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r3) {
        C60694Jpf jpf = (C60694Jpf) r3;
        if (jpf.A04 == null) {
            jpf.A0G.setImageBitmap((Bitmap) null);
        } else {
            C60694Jpf.A01(jpf);
            C349307zv r0 = jpf.A02;
            r0.getClass();
            if (!r0.A18) {
                JTP.A1S(jpf.A02.A0k);
            }
        }
        jpf.A08.setOnClickListener((View.OnClickListener) null);
        jpf.A0D.setOnClickListener((View.OnClickListener) null);
        if (jpf == this.A00) {
            this.A00 = null;
        }
    }

    public C59792JYl(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, MV4 mv4, AnonymousClass0eK r9) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A06 = mv4;
        this.A0A = r9;
        C353278Gz A002 = new 2YN(fragment).A00(C353278Gz.class);
        this.A07 = A002;
        this.A05 = new C59941Jc5((AudioManager) fragmentActivity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        A002.A03.A06(fragment.getViewLifecycleOwner(), new C64317LZr(this, 3));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1574622700);
        int size = this.A08.size();
        AnonymousClass0fD.A0A(319709765, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = DbT.A0C(JTP.A0G(viewGroup), viewGroup, R.layout.layout_format_capture_itemview);
        FragmentActivity fragmentActivity = this.A02;
        C353278Gz r5 = this.A07;
        return new C60694Jpf(A0C, fragmentActivity, this.A04, this.A05, r5, this.A0A);
    }
}
