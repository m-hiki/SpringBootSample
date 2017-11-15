package front.controller.template;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import common.domain.entity.Underlier;

import front.service.UnderlierService;


@Controller
@RequestMapping("/trade")
public class TradePageController {
    @Autowired
    private UnderlierService underlierService;

    @RequestMapping(method=RequestMethod.GET)
    public String trade(Model model) {
        List<Underlier> underlierList = this.underlierService.getUnderlierList();
            /*
            new ArrayList<Underlier>() {
                {
                    add(new Underlier(){{
                        underlierCd = "USDJPY";
                        underlierName = "USD/JPY";
                    }});
                    add(new Underlier(){{
                        underlierCd = "EURJPY";
                        underlierName = "EUR/JPY";
                    }});
                    add(new Underlier(){{
                        underlierCd = "GBPJPY";
                        underlierName = "GBP/JPY";
                    }});
                }};
            */
        model.addAttribute("underlierList", underlierList);

        return "trade";
    }
}
