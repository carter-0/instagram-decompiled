package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import java.io.ByteArrayOutputStream;

/* renamed from: X.KHs  reason: case insensitive filesystem */
public final class C61684KHs extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C61684KHs(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A04 = obj4;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public final void DP5(View view) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                LN9 ln9 = (LN9) this.A05;
                C317466nJ r3 = ln9.A02;
                if (r3 != null) {
                    UserSession userSession = (UserSession) this.A04;
                    AnonymousClass0iw r5 = (AnonymousClass0iw) this.A01;
                    Resources resources = (Resources) this.A03;
                    Context context = (Context) this.A02;
                    C314236hs r0 = ln9.A01;
                    if (r0 != null) {
                        r0.Cw1(view, r3);
                    }
                    C317486nL B0p = r3.B0p();
                    if (r3.CKf() && B0p != null) {
                        new C56807IDe(r5, userSession, ln9.A0A, B0p, new C65782Lza(context, view, ln9), resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen), false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                0qQ.A0B(view, 0);
                ((0sL) this.A02).invoke(view, this.A01);
                return;
            default:
                super.DP5(view);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final boolean Dqe(View view) {
        C317876nz BzU;
        Drawable drawable;
        AnonymousClass8N6 r9;
        String str;
        C347017w8 r1;
        View view2 = view;
        switch (this.A00) {
            case 0:
                0qQ.A0B(view2, 0);
                LN9 ln9 = (LN9) this.A05;
                ? r5 = ln9.A0A;
                Context context = r5.getContext();
                C317466nJ r10 = ln9.A02;
                if (r10 == null) {
                    return true;
                }
                UserSession userSession = (UserSession) this.A04;
                C317476nK CAW = r10.CAW();
                Drawable drawable2 = null;
                if (CAW == C317476nK.EMOJI) {
                    C317486nL B0p = r10.B0p();
                    if (B0p != null) {
                        drawable2 = JTU.A0K(context, B0p);
                    }
                } else if (CAW == C317476nK.STICKER && (BzU = r10.BzU()) != null) {
                    if (BzU.A00() == C318046oG.CUTOUT_VIDEO) {
                        Drawable drawable3 = r5.getDrawable();
                        if (!(drawable3 instanceof C347017w8) || (r1 = (C347017w8) drawable3) == null) {
                            drawable = null;
                        } else {
                            drawable = JTR.A0S(r1);
                        }
                        if (!(drawable instanceof AnonymousClass8N6) || (r9 = (AnonymousClass8N6) drawable) == null || (!((str = r9.A0D) == null && (str = r9.A0F) == null) && JTQ.A1Z(str))) {
                            drawable2 = r5.getDrawable();
                        } else if (r9.isLoading() || !182.A06(0Tu.A06, userSession, 36323805438291484L)) {
                            return true;
                        } else {
                            AnonymousClass2hY E1h = AnonymousClass2hY.A09.E1h(r9.A0l);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            AnonymousClass1T9 r0 = ln9.A00;
                            if (r0 != null) {
                                r0.cancel();
                            }
                            ln9.A00 = 14G.A03().A06(new C64606Leq(view2, ln9, r9, r10, byteArrayOutputStream), LN9.A0C, E1h, (0lg) null);
                            return true;
                        }
                    } else {
                        C314236hs r02 = ln9.A01;
                        if (r02 != null) {
                            0qQ.A0A(context);
                            drawable2 = AJA.A00(context, userSession, r02, BzU);
                        }
                    }
                }
                C314236hs r03 = ln9.A01;
                if (r03 == null) {
                    return true;
                }
                r03.Cw2(drawable2, view2, r10);
                return true;
            case 1:
                0qQ.A0B(view2, 0);
                C68137N2b n2b = (C68137N2b) this.A01;
                C69480NmO nmO = C69480NmO.REGULAR;
                C67967Mxr mxr = (C67967Mxr) this.A05;
                int bindingAdapterPosition = mxr.getBindingAdapterPosition();
                C61064Jw2 jw2 = (C61064Jw2) this.A04;
                String A002 = C69844Nt8.A00((Integer) jw2.A01);
                boolean z = jw2.A03;
                ((0sL) this.A03).invoke(n2b, new N34(nmO, AnonymousClass7TE.A0v(), (Boolean) jw2.A00, (String) null, jw2.A02, A002, bindingAdapterPosition, z));
                UserSession userSession2 = mxr.A00;
                OPI.A01(userSession2, new PUH((C317966o8) null, (C317966o8) null, C69304Nj5.GIPHY, n2b, (DirectStoreSticker) null, System.currentTimeMillis()), DbS.A04(0Tu.A05, userSession2, 36609803016607670L));
                return true;
            case 2:
                C17801VgE vgE = (C17801VgE) this.A02;
                QuestionMediaResponseModel questionMediaResponseModel = vgE.A00.A03;
                if (questionMediaResponseModel != null) {
                    Integer num = questionMediaResponseModel.A04;
                    num.getClass();
                    if (num.intValue() == 1iA.A0a.A00) {
                        Object obj = this.A01;
                        AnonymousClass3WR r7 = (AnonymousClass3WR) this.A05;
                        r7.getClass();
                        Context context2 = ((Us7) this.A03).A00.getContext();
                        QuestionMediaResponseModel questionMediaResponseModel2 = vgE.A00.A03;
                        questionMediaResponseModel2.getClass();
                        ImageInfo imageInfo = questionMediaResponseModel2.A00;
                        imageInfo.getClass();
                        Integer num2 = questionMediaResponseModel2.A06;
                        num2.getClass();
                        int intValue = num2.intValue();
                        Integer num3 = questionMediaResponseModel2.A05;
                        num3.getClass();
                        C18240Vo7.A00(context2, imageInfo, intValue, num3.intValue()).getClass();
                        VideoUrlImpl A003 = C255583uN.A00(r7);
                        A003.getClass();
                        AnonymousClass16c A004 = AnonymousClass3OT.A00(A003);
                        0qQ.A0A(A004);
                        C290815g0 A032 = C59730JVo.A03(context2, (UserSession) this.A04, new C11211SFl(((VideoUrlImpl) A004).A06, "QuestionVideoResponse", 0, 0, true, false, AnonymousClass7TF.A1Q(C271404in.A0D((MusicOverlayStickerModel) null) ? 1 : 0), false, false));
                        A032.A00 = new C385899ji(5, obj, questionMediaResponseModel2, vgE);
                        1ES.A03(A032);
                        return true;
                    }
                }
                ((C15353Ub4) this.A01).A04.A03(vgE);
                return true;
            default:
                return super.Dqe(view2);
        }
    }
}
