package X;

import android.os.Bundle;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.HashSet;
import java.util.Set;

public final class SG1 {
    public int A00;
    public long A01;
    public Bundle A02;
    public FixedSizes A03;
    public RE7 A04;
    public RF2 A05;
    public CreditCardModulesDownloader A06;
    public IdCaptureExperimentConfigProvider A07;
    public SmartCaptureLoggerProvider A08;
    public ResourcesProvider A09;
    public StringOverrideFactory A0A;
    public IdCaptureUi A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G = "";
    public String A0H;
    public String A0I;
    public Set A0J = AnonymousClass7TE.A1F();
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static void A00(SG1 sg1, String str) {
        if (!sg1.A0J.contains(str)) {
            HashSet A12 = C66580MXl.A12(sg1.A0J);
            sg1.A0J = A12;
            A12.add(str);
        }
    }
}
