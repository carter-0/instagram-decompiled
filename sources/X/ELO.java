package X;

import android.net.Uri;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.function.Function;

public final class ELO extends C253103qD {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ELO(String str, Function function, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = function;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        Uri.Builder builder;
        String str3;
        Function function;
        InlineLinkUrn inlineLinkUrn;
        switch (this.A00) {
            case 0:
                str = this.A02;
                str.getClass();
                str2 = str.toLowerCase().replace("#", "");
                builder = new Uri.Builder();
                str3 = "hashtag";
                break;
            case 1:
                str = this.A02;
                str.getClass();
                str2 = str.toLowerCase().replace("@", "");
                builder = new Uri.Builder();
                str3 = "mention";
                break;
            default:
                String obj = new Uri.Builder().authority("expand_text").build().toString();
                function = (Function) this.A01;
                inlineLinkUrn = new InlineLinkUrn(this.A02, obj);
                break;
        }
        String obj2 = DbV.A08(builder.authority(str3), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2).toString();
        function = (Function) this.A01;
        inlineLinkUrn = new InlineLinkUrn(str, obj2);
        function.apply(inlineLinkUrn);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELO(String str, Function function, int i, int i2) {
        super(false, i);
        this.A00 = 2;
        this.A01 = function;
        this.A02 = str;
    }
}
