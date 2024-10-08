package X;

import android.content.Context;
import android.os.Bundle;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.modal.TransparentBackgroundModalActivity;

/* renamed from: X.9PV  reason: invalid class name */
public final class AnonymousClass9PV implements C358108aN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static void A00(AnonymousClass9PV r4, String str, String str2) {
        0kD.A07(IgVoltronModelLoader.TAG, 002.A0R(str, str2), (Throwable) null);
        Throwable th = new Throwable(str2);
        0qQ.A0B(th, 0);
        ((0sP) r4.A01).invoke(new 0eR(new 0eQ(th)));
    }

    public AnonymousClass9PV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFailure(String str, boolean z) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                A00(this, "fetchExecuTorchVoltronModule onFailure ", str);
                return;
            case 1:
                0qQ.A0B(str, 0);
                A00(this, "fetchSentencePieceVoltronModule onFailure ", str);
                return;
            case 2:
                C59689JTv.A01((Context) this.A02, (String) null, 2131974093, 1);
                return;
            default:
                0qQ.A0B(str, 0);
                AnonymousClass930 r3 = (AnonymousClass930) this.A01;
                if (r3 != null) {
                    r3.A00.markerPoint(331812717, "LIBRARY_DOWNLOAD_END");
                    AnonymousClass930.A00(r3, str, false);
                }
                ((C241063Ns) this.A02).A0T(false);
                return;
        }
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                try {
                    0dV.A0D("executorch", 16);
                    ((IgVoltronModelLoader) this.A02).areExecuTorchLibrariesLoaded.set(true);
                    ((0sP) this.A01).invoke(new 0eR(C60340gF.A00));
                    return;
                } catch (UnsatisfiedLinkError e) {
                    0kD.A07(IgVoltronModelLoader.TAG, 002.A0R("SoLoader exception ", e.getLocalizedMessage()), (Throwable) null);
                    return;
                }
            case 1:
                ((IgVoltronModelLoader) this.A02).areSentencePieceLibrariesLoaded.set(true);
                ((0sP) this.A01).invoke(new 0eR(C60340gF.A00));
                return;
            case 2:
                Context context = (Context) this.A01;
                Object newInstance = Class.forName("com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl").newInstance();
                0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.dogfoodingassistant.intf.DogfoodingAssistantPlugin");
                C48252EbX ebX = (C48252EbX) newInstance;
                0qQ.A0B(ebX, 0);
                C48252EbX.A00 = ebX;
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("bottom_sheet_content_fragment", "dogfood_assistant");
                A0a.putString("bottom_sheet_title", context.getString(2131958442));
                A0a.putString("dogfooding_assistant_surface", "discovery");
                AnonymousClass6W8.A06(context, A0a, TransparentBackgroundModalActivity.class, "bottom_sheet");
                return;
            default:
                AnonymousClass930 r0 = (AnonymousClass930) this.A01;
                if (r0 != null) {
                    r0.A00.markerPoint(331812717, "LIBRARY_DOWNLOAD_END");
                }
                ((C241063Ns) this.A02).A0T(true);
                return;
        }
    }
}
