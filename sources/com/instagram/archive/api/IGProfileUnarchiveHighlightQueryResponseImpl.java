package com.instagram.archive.api;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41848B3p;

public final class IGProfileUnarchiveHighlightQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XdtUnarchiveHighlight extends C250663lr implements C250673ls {
        public XdtUnarchiveHighlight() {
            super(1664355468);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41848B3p.A0C(), "error_message");
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XdtUnarchiveHighlight.class, "xdt_unarchive_highlight(request_data:{\"highlight_id\":$highlight_id})", 1664355468);
    }

    public IGProfileUnarchiveHighlightQueryResponseImpl() {
        super(-539191743);
    }
}
