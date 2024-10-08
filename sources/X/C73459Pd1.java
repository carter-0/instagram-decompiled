package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Pd1  reason: case insensitive filesystem */
public final class C73459Pd1 implements AnonymousClass0eK {
    public final int A00;
    public final Object A01;

    public C73459Pd1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return DbT.A0E(this.A01);
            case 1:
            case 2:
                return ((MYR) this.A01).getRecyclerView();
            case 3:
                NJq nJq = (NJq) this.A01;
                return C69920NuM.A00(nJq.A05, nJq.A08, nJq.A0B, nJq.A0G, nJq.A0P, nJq.A0E.booleanValue());
            case 4:
                1ap r2 = 1as.A04.A02;
                NJq nJq2 = (NJq) this.A01;
                UserSession userSession = nJq2.A05;
                DirectAvatarTrayFragmentConfig.Tab tab = DirectAvatarTrayFragmentConfig.Tab.A00;
                C69319NjK njK = nJq2.A08;
                if (njK == null) {
                    njK = C69319NjK.DIRECT_COMPOSER_STICKER_BUTTON;
                }
                List list = nJq2.A0H;
                boolean z = nJq2.A0P;
                return r2.A01(userSession, tab, new P0Y(this), njK, nJq2.A0B, nJq2.A0F, list, z);
            case 5:
                NJq nJq3 = (NJq) this.A01;
                UserSession userSession2 = nJq3.A05;
                DirectThreadKey directThreadKey = nJq3.A0B;
                String str = nJq3.A0G;
                boolean z2 = nJq3.A0V;
                boolean z3 = nJq3.A0K;
                boolean z4 = nJq3.A0R;
                boolean z5 = nJq3.A0J;
                boolean z6 = nJq3.A0N;
                boolean z7 = nJq3.A0S;
                boolean z8 = nJq3.A0U;
                boolean z9 = nJq3.A0O;
                boolean z10 = nJq3.A0I;
                boolean z11 = nJq3.A0L;
                boolean z12 = nJq3.A0Q;
                boolean z13 = nJq3.A0P;
                C69319NjK njK2 = nJq3.A08;
                String str2 = nJq3.A0F;
                Bundle A0A = DbY.A0A(userSession2);
                AnonymousClass0Dg.A00(A0A, userSession2);
                A0A.putString("param_extra_initial_search_term", str);
                A0A.putBoolean("param_extra_show_like_sticker", z2);
                A0A.putBoolean("param_extra_is_broadcast_thread", z3);
                A0A.putBoolean("param_extra_is_poll_enabled", z4);
                A0A.putBoolean("param_extra_ai_sticker_enabled", z5);
                A0A.putBoolean("param_extra_imagine_enabled", z6);
                A0A.putBoolean("param_extra_saved_sticker_enabled", z7);
                A0A.putBoolean("param_extra_sticker_packs_enabled", z8);
                A0A.putBoolean("param_extra_is_location_sticker_enabled", z9);
                A0A.putBoolean("param_extra_is_add_yours_sticker_enabled", z10);
                A0A.putBoolean("param_extra_is_cutout_sticker_enabled", z11);
                A0A.putBoolean("param_extra_is_music_sticker_enabled", z12);
                A0A.putBoolean("param_extra_is_msys_thread", z13);
                A0A.putParcelable("param_extra_direct_thread_key", directThreadKey);
                A0A.putSerializable("param_extra_sticker_tray_entrypoint", njK2);
                A0A.putString("param_extra_bottom_sheet_session_id", str2);
                NJX njx = new NJX();
                njx.setArguments(A0A);
                return njx;
            case 6:
                return AnonymousClass7Z6.A00((UserSession) this.A01);
            case 7:
                UserSession A0Q = C66581MXm.A0Q(this.A01);
                return 1y0.A00(A0Q).A01(PEN.class, C73913Plo.A00(A0Q, 42));
            case 8:
            case 10:
                return DbT.A0r(this.A01);
            case 9:
                return C67497Mor.A00((UserSession) this.A01);
            case 11:
                return 28K.A00((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return this.A01;
            case 13:
                return C2612848z.A00;
            default:
                return ((AnonymousClass0eM) this.A01).getValue();
        }
    }
}
