package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.PwB  reason: case insensitive filesystem */
public interface C74516PwB {
    List AZs();

    C242373Tu AiM();

    Integer Amj();

    boolean AqP();

    ImageUrl AsU();

    String AsX();

    @Deprecated(message = "Use UnifiedThreadKey instead to support MSYS threads", replaceWith = @ReplaceWith(expression = "getUnifiedThreadKey()", imports = {}))
    DirectThreadKey AxH();

    List AxI();

    String B4l();

    int BHS();

    AnonymousClass170 BIs();

    List BJk();

    List BJl();

    long BKe();

    String BKx();

    Long BLI();

    Integer BMT();

    int BSK();

    Map BWN();

    AnonymousClass9IM BWj();

    int BXL();

    List Bal();

    long Bca();

    List Bk9();

    List BkC();

    N2U C43();

    int C66();

    ImageUrl C6B();

    DirectShareTarget C6Y();

    int C6a();

    String C6f();

    C254923tH C9i();

    C254743sy CBV();

    User CCg(String str, String str2);

    LinkedHashMap CCp();

    boolean CJW();

    boolean CJY();

    boolean CK8();

    boolean CKs();

    boolean CKt();

    boolean CKu();

    boolean CKv();

    boolean CKw();

    boolean CMM();

    boolean CMN();

    boolean COe();

    boolean CR6();

    boolean CRe();

    boolean CSK();

    boolean CTB();

    boolean CTo();

    boolean CUG();

    boolean CUK();

    boolean CUb();

    boolean CV3();

    boolean CVE();

    boolean CVr();

    boolean CW6();

    boolean CWb();

    boolean CWe();

    boolean CWp();

    boolean CXF();

    boolean CY7();

    boolean CZA();

    boolean CZE();

    boolean Ca9();

    boolean CaM();

    boolean CaN();

    boolean CcG();

    boolean Cck();

    boolean CdF();

    boolean CdG();

    boolean Cdt();

    boolean Cdy();

    boolean CeB();

    boolean CeT();

    boolean CeU();

    boolean Cel();

    boolean EtA();

    boolean EtG();

    boolean isMuted();

    boolean isPending();
}
