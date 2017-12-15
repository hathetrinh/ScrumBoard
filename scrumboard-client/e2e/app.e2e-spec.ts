import { ScrumboardClientPage } from './app.po';

describe('scrumboard-client App', function() {
  let page: ScrumboardClientPage;

  beforeEach(() => {
    page = new ScrumboardClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
